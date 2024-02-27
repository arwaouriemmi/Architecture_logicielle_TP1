package com.directi.training.srp.exercise_refractored;

import java.util.List;

public class CarFormatter {

    private static String getName(Car car){
        StringBuilder sb = new StringBuilder();
        sb.append(car.getBrand());
        sb.append(" ");
        sb.append(car.getModel());
        return sb.toString();
    }


    public static String getCarsNames(List<Car> _carsDb)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(CarFormatter.getName(car));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
    
}
