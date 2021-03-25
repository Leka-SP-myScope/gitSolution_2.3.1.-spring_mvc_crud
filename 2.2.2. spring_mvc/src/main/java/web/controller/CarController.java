package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private static List<Car> allCars = new ArrayList<>();

    static {
        allCars.add(new Car("BMW", "Car is very good", "Black"));
        allCars.add(new Car("AUDI", "Car is not bad at all", "White"));
        allCars.add(new Car("RENAULT", "Car is not bad", "Grey"));
        allCars.add(new Car("MAZDA", "Car is good", "Red"));
        allCars.add(new Car("ZAPOROZHEC", "Car is epic", "Yellow"));
    }

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model) {
        model.addAttribute("allCars", allCars);
        return "cars";
    }
}
