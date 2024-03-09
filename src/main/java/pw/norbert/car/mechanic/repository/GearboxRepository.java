package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.Gearbox;

public interface GearboxRepository extends CrudRepository<Gearbox,Integer> {
}
