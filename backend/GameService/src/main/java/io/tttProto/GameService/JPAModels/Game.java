package io.tttProto.GameService.JPAModels;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private int turnNumber;



    @OneToMany(mappedBy = "game")
    private List<Square> squares;

    @OneToMany(mappedBy = "game")
    private List<Move> moves;
}
