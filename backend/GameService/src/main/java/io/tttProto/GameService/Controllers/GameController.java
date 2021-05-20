package io.tttProto.GameService.Controllers;

import io.tttProto.GameService.JPAModels.Game;
import io.tttProto.GameService.JPAModels.Move;
import io.tttProto.GameService.Services.gameManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController("game")
public class GameController {

    private final gameManagementService gmService;

    public GameController(gameManagementService gmService) {
        this.gmService = gmService;
    }

    @PostMapping("makeMove")
    public void makeMove(@RequestBody Move move){

    }

    @GetMapping("newGame")
    public Game newGame(){
        return gmService.newGame();
    }

    @GetMapping("joinGame/{id}")
    public Game joinGame(@PathVariable int id){
        return gmService.joinGame(id);
    }
}
