package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("toyota", "corolla", 130));
        carList.add(new Car("suzuki", "grandvitara", 359));
        carList.add(new Car("lada", "granta", 666));
        return carList;
    }
}
