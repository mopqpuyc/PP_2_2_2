package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Volvo",1,12600L));
        cars.add(new Car("Peugeot",2,45600L));
        cars.add(new Car("Volkswagen",3,31200L));
        cars.add(new Car("Opel",4,111400L));
        cars.add(new Car("Kia",5,5500L));
    }

    @Override
    public List<Car> getLimitedListCars(int carCount) {
        return cars.stream()
                .limit(carCount)
                .toList();
    }
}
