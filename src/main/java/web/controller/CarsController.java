package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {
    CarService service;

    @Autowired
    public CarsController(CarService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false)Integer count, Model model) {
        model.addAttribute("carList", service.getCountCars(count));
        return "cars";
    }
}
