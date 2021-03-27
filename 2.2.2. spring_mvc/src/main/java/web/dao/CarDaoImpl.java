package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Car is very good", "Black"));
        cars.add(new Car("AUDI", "Car is not bad at all", "White"));
        cars.add(new Car("RENAULT", "Car is not bad", "Grey"));
        cars.add(new Car("MAZDA", "Car is good", "Red"));
        cars.add(new Car("ZAPOROZHEC", "Car is epic", "Yellow"));

        //cars.stream().filter(x ->.size() >= count).collect(Collectors.toList()).subList(0, count - 1);

        if (count < cars.size()) {
            return cars.subList(0, count);
        }
        return cars;
    }
}
