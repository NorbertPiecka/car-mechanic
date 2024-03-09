package pw.norbert.car.mechanic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import pw.norbert.car.mechanic.model.News;

public interface NewsRepository extends CrudRepository<News, Integer> {
}
