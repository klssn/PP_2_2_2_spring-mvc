package web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import web.model.Car;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Tesla", "White", 150));
        cars.add(new Car("Ford", "Black", 180));
        cars.add(new Car("Kia", "Silver", 100));
        cars.add(new Car("BMW", "Red", 200));
        cars.add(new Car("Bugatti", "Gold", 250));
    }

    @Override
    public List<Car> getCountCars(Integer count) {
        return cars.subList(0, (count == null ? 5 : count >= 5 ? 5 : count <= 0 ? 0 : count));
    }
}
