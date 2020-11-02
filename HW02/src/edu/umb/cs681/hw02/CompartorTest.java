package edu.umb.cs681.hw02;

import java.util.ArrayList;
import java.util.List;

import java.util.Comparator;
import java.util.stream.Collectors;

public class CompartorTest {

	public static void main(String[] args) {
		List<Car> cars = getCarList();
		
		
		System.out.println("Sorted by price:");
       
        ArrayList<Car> sortedPrice = cars.stream().sorted(Comparator.comparing(Car :: getPrice)).collect(Collectors.toCollection(ArrayList::new));
		
        sortedPrice.forEach((Car car) -> System.out.println(car.getModel()+ ":" + car.getPrice()));
        
		System.out.println(	 cars.stream().sorted(Comparator.comparing(Car::getYear)).collect(Collectors.toList()));

		System.out.println("Cars List "+ cars);

	}


	private static List<Car> getCarList() {
		List<Car> cars = new ArrayList<>();
		Car car1 = new Car("Volkswagen Atlas", 45000, 2005);
		Car car2 = new Car("Jaguar F-Type", 130000, 2015);
		Car car3 = new Car("Alfa Romeo Stelvio", 50000, 2017);
		Car car4 = new Car("BMW 7-Series", 15700, 2018);

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);

		return cars;
	}
}
