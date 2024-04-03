package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> listCars = new ArrayList<>();

    {
        listCars.add(new Car("mers", 2015, "blue"));
        listCars.add(new Car("bmw", 2012, "green"));
        listCars.add(new Car("opel", 2003, "white"));
        listCars.add(new Car("vaz", 2023, "black"));
        listCars.add(new Car("audi", 2011, "purple"));
    }

    @Override
    public List<Car> getListByCars(int count) {
        return listCars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
