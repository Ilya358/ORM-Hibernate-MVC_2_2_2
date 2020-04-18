package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

    final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping("cars")
    public String printCar(ModelMap model) {
        List<Car> carList = carService.getCarList();
        model.addAttribute("carList", carList);
        return "cars";
    }
}
