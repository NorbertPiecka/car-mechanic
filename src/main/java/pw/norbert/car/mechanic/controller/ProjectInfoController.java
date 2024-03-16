package pw.norbert.car.mechanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectInfoController {

    @RequestMapping("/projekt")
    public String showProjectPage() {
        return "project";
    }
}
