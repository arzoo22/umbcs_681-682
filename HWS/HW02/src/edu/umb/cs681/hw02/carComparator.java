package edu.umb.cs681.hw02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class carComparator{
    static ArrayList<Car> cars = new ArrayList<Car>(
        Arrays.asList(
                new Car(5000, 2013, "Ford", 45009),
                new Car(16000, 2017, "Toyota", 38442),
                new Car(8000, 2014, "Audi", 98120),
                new Car(20000, 2017, "Tesla", 40509)
        )
    );



    public static void main(String[] args){
        System.out.println("Sorted by year:");
        ArrayList<Car> sortedYear = cars.stream().sorted(Comparator.comparing(Car :: getYear, Comparator.reverseOrder())).collect(Collectors.toCollection(ArrayList::new));
        sortedYear.forEach((Car car) -> System.out.println(car.getMake()+ ":" + car.getYear()));

        System.out.println("Sorted by price:");
        ArrayList<Car> sortedPrice = cars.stream().sorted(Comparator.comparing(Car :: getPrice)).collect(Collectors.toCollection(ArrayList::new));
        sortedPrice.forEach((Car car) -> System.out.println(car.getMake()+ ":" + car.getPrice()));

        System.out.println("Sorted by mileage:");
        ArrayList<Car> sortedMileage = cars.stream().sorted(Comparator.comparing(Car :: getMileage)).collect(Collectors.toCollection(ArrayList::new));
        sortedMileage.forEach((Car car) -> System.out.println(car.getMake()+ ":" + car.getMileage()));

        System.out.println("Sorted by dominationCounter:");
        cars.forEach((Car car)->car.setDominationCounter(cars));
        ArrayList<Car> sortedDominationCounter = cars.stream().sorted(Comparator.comparing(Car :: getDominationCounter, Comparator.reverseOrder())).collect(Collectors.toCollection(ArrayList::new));
        sortedDominationCounter.forEach((Car car) -> System.out.println(car.getMake()+ ":" + car.getDominationCounter()));

    }
}