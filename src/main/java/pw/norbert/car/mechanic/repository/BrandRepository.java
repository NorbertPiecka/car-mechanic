package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.Brand;

public interface BrandRepository extends CrudRepository<Brand,Integer> {
}
