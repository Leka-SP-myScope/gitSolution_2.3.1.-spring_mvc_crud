package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getAllCar() {
        return null;
    }
}
