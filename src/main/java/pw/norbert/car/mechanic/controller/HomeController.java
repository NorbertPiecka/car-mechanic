package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pw.norbert.car.mechanic.model.News;
import pw.norbert.car.mechanic.repository.NewsRepository;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private NewsRepository newsRepository;

    @RequestMapping("/")
    public String showHomePage(Model model) {
        List<News> news = (List<News>) newsRepository.findAll();
        model.addAttribute("news", news);
        return "home";
    }

    @RequestMapping("/news/{newsId}")
    public String showNewsDetails(Model model, @PathVariable int newsId) {
        News news = newsRepository.findById(newsId).get();
        model.addAttribute("news", news);
        return "news";
    }
}
