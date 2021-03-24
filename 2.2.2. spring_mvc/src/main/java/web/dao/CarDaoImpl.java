package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getAllCar() {
        return null;
    }
}
