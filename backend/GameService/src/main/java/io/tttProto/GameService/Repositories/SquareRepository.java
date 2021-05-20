package io.tttProto.GameService.Repositories;

import io.tttProto.GameService.JPAModels.Square;
import org.springframework.data.repository.CrudRepository;

public interface SquareRepository extends CrudRepository<Square, Integer> {
}
