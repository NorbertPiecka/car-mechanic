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
        return "car";
    }
}
