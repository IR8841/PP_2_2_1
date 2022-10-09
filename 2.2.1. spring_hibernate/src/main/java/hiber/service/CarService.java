package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface CarService {

    void add(Car car);

    List<Car> getCars();

    List <User> getUsersByCar(String model, int series);
}
