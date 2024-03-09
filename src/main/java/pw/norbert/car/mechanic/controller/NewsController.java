package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pw.norbert.car.mechanic.model.Car;
import pw.norbert.car.mechanic.model.News;
import pw.norbert.car.mechanic.model.Offer;
import pw.norbert.car.mechanic.repository.CarRepository;
import pw.norbert.car.mechanic.repository.NewsRepository;
import pw.norbert.car.mechanic.repository.OfferCategoryRepository;
import pw.norbert.car.mechanic.repository.OfferRepository;

@RestController
@RequestMapping(path="/")
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private OfferCategoryRepository offerCategoryRepository;

    @Autowired
    private CarRepository carRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Offer> getAllUsers() {
        return offerRepository.findAll();
    }

    @GetMapping(path="/cars")
    public @ResponseBody Iterable<Car> getAllCars() { return carRepository.findAll();}
}
