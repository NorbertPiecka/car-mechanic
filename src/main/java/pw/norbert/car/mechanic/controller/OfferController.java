package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pw.norbert.car.mechanic.model.Offer;
import pw.norbert.car.mechanic.repository.OfferRepository;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

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
        List<Offer> mechOffers = offers.stream().filter(offer -> Objects.equals(offer.getOfferCategory().getName(), "Mechanika")).toList();
        model.addAttribute("mechOffer", mechOffers);
        // Elektryka
        List<Offer> eleOffers = offers.stream().filter(offer -> Objects.equals(offer.getOfferCategory().getName(), "Elektryka")).toList();
        model.addAttribute("eleOffer", eleOffers);
        // Wulkanizacja
        List<Offer> wulOffers = offers.stream().filter(offer -> Objects.equals(offer.getOfferCategory().getName(), "Wulkanizacja")).toList();
        model.addAttribute("wulOffer", wulOffers);
        // Dodatkowe
        List<Offer> addOffers = offers.stream().filter(offer -> Objects.equals(offer.getOfferCategory().getName(), "Dodatkowe")).toList();
        model.addAttribute("dodOffer", addOffers);
        return "offer";
    }
}
