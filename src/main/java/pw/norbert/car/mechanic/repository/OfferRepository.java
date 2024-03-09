package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import pw.norbert.car.mechanic.model.Offer;

public interface OfferRepository extends CrudRepository<Offer, Integer> {
}
