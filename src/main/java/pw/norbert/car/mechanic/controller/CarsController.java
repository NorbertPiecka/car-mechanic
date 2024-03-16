package pw.norbert.car.mechanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pw.norbert.car.mechanic.model.Car;
import pw.norbert.car.mechanic.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {
    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/auta")
    public String showCars(Model model) {
        List<Car> cars = (List<Car>) carRepository.findAll();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @RequestMapping("/auto/{carId}")
    public String showCar(Model model, @PathVariable int carId) {
        Car car = carRepository.findById(carId).get();
        model.addAttribute("car", car);
        model.addAttribute("loremIpsum", generateLoremIpsum());
        return "car";
    }

    private String generateLoremIpsum() {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        return loremIpsum;
    }
}
