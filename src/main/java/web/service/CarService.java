package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getListByCars(int x);
    List<Car> getAllCars();
}
