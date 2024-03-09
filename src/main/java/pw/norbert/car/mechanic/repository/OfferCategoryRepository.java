package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.OfferCategory;

public interface OfferCategoryRepository extends CrudRepository<OfferCategory, Integer> {
}
