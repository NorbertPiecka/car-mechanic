package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {
}
