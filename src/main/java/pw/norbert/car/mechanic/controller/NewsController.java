package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pw.norbert.car.mechanic.model.News;
import pw.norbert.car.mechanic.repository.NewsRepository;

@Controller
@RequestMapping(path="/")
public class NewsController {
    @Autowired
    private NewsRepository newsRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<News> getAllUsers() {
        return newsRepository.findAll();
    }
}
