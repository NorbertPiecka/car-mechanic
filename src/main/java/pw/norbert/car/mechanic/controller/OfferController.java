package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pw.norbert.car.mechanic.model.Offer;
import pw.norbert.car.mechanic.repository.OfferRepository;

import java.util.List;

@Controller
public class OfferController {
    @Autowired
    private OfferRepository offerRepository;

    @RequestMapping("/oferta")
    public String showOffer(Model model) {
        List<Offer> offers = (List<Offer>) offerRepository.findAll();
        model.addAttribute("offer", offers);
        return "offer";
    }
}
