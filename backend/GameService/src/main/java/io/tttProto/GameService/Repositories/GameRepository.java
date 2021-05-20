package io.tttProto.GameService.Repositories;

import io.tttProto.GameService.JPAModels.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Integer> {
    Game findById(int id);
}
