package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pw.norbert.car.mechanic.model.News;
import pw.norbert.car.mechanic.repository.NewsRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    @Autowired
    private NewsRepository newsRepository;

    @RequestMapping("/")
    public String showHomePage(Model model) {
        List<News> news = (List<News>) newsRepository.findAll();
        List<News> topNews = news.stream().sorted((n1, n2)-> n2.getDate().compareTo(n1.getDate())).limit(3).toList();
        model.addAttribute("news", topNews);
        return "home";
    }

    @RequestMapping("/news/{newsId}")
    public String showNewsDetails(Model model, @PathVariable int newsId) {
        News news = newsRepository.findById(newsId).get();
        model.addAttribute("news", news);
        model.addAttribute("loremIpsum", generateLoremIpsum());
        return "news";
    }

    private String generateLoremIpsum() {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        return loremIpsum;
    }
}
