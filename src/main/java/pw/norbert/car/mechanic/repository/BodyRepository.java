package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.Body;

public interface BodyRepository extends CrudRepository<Body, Integer> {
}
