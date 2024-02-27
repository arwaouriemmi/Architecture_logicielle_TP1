package com.directi.training.srp.exercise_refractored;

import java.util.Arrays;
import java.util.List;

public class CarManager
{
    private CarRepository carRepository;

    public Car getFromDb(final String carId)
    {
        List<Car> _carsDb = carRepository.getAllFromDb();
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        List<Car> _carsDb = carRepository.getAllFromDb();
        return CarFormatter.getCarsNames(_carsDb);
    }

    public Car getBestCar()
    {
        List<Car> _carsDb = carRepository.getAllFromDb();
        return CarComparer.getBestCarByModel(_carsDb);
    }
}
