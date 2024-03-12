package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private OfferCategoryRepository offerCategoryRepository;

    @Autowired
    private CarRepository carRepository;

    private String loremIpsum = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Offer> getAllUsers() {
        return offerRepository.findAll();
    }

    @RequestMapping("/cars")
    public String showCars(Model model) {
        List<Car> cars = (List<Car>) carRepository.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @RequestMapping("/")
    public String showNews(Model model) {
        List<News> news = (List<News>) newsRepository.findAll();
        model.addAttribute("news", news);
        return  "home";
    }

    @RequestMapping("/test")
    public String showTest(Model model) {
        List<News> news = (List<News>) newsRepository.findAll();
        model.addAttribute("news", news);
        model.addAttribute("lorem", loremIpsum);
        return  "template";
    }

}
