package io.tttProto.GameService.Controllers;

import io.tttProto.GameService.JPAModels.Move;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class messageController {

    @MessageMapping("/test")
    @SendTo("/Games/Game/{GameID}")
    public Move makeMove (@Payload final Move move){
        return move;
    }
}
