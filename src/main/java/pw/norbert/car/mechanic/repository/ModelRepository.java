package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.Model;

public interface ModelRepository extends CrudRepository<Model, Integer> {
}
