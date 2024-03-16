package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pw.norbert.car.mechanic.model.Offer;
import pw.norbert.car.mechanic.repository.OfferRepository;

import java.sql.Date;
import java.util.List;

@Controller
public class OfferController {
    @Autowired
    private OfferRepository offerRepository;

    @RequestMapping("/oferta")
    public String showOffer(Model model) {
        List<Offer> offers = (List<Offer>) offerRepository.findAll();
        Date offerDate = offers.stream().sorted(((o1, o2) -> o2.getUpdate_date().compareTo(o1.getUpdate_date()))).limit(1).toList().get(0).getUpdate_date();
        model.addAttribute("offerDate", offerDate);
        // Mechanika

        // Elektryka

        // Wulkanizacja

        // Dodatkowe
        return "offer";
    }
}
