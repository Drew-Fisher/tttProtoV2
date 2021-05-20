package io.tttProto.GameService.JPAModels;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Square {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;
}
