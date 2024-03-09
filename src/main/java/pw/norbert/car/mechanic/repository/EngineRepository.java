package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.Engine;

public interface EngineRepository extends CrudRepository<Engine, Integer> {
}
