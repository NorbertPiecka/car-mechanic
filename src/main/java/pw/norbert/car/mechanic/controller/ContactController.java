package pw.norbert.car.mechanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {

    @RequestMapping("/kontakt")
    public String showContactPage() {
        return "contact";
    }
}

