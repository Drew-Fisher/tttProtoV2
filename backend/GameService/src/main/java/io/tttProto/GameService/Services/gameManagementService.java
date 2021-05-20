package io.tttProto.GameService.Services;

import io.tttProto.GameService.JPAModels.Game;
import io.tttProto.GameService.JPAModels.Square;
import io.tttProto.GameService.Repositories.GameRepository;
import io.tttProto.GameService.Repositories.SquareRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class gameManagementService {

    private final SquareManagementService squareManagementService;
    private final GameRepository gameRepository;
    private final SquareRepository squareRepository;

    public gameManagementService(SquareManagementService squareManagementService, GameRepository gameRepository, SquareRepository squareRepository) {
        this.squareManagementService = squareManagementService;
        this.gameRepository = gameRepository;
        this.squareRepository = squareRepository;
    }

    public Game newGame(){
        List<Square> board = squareManagementService.newBoard();
        Game game = Game.builder()
                .turnNumber(0)
                .squares(board)
                .build();
        gameRepository.save(game);
        squareRepository.saveAll(board);
        return game;
    }

    public Game joinGame(int id){
        if(gameRepository.existsById(id)){
            return gameRepository.findById(id);
        }
        return null;
    }
}
