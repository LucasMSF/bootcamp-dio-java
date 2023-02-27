package br.edu.lucasdev.dataStructure.javastructures.equalsAndHashCode;

import br.edu.lucasdev.dataStructure.javastructures.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Car car1 = new Car("BMW");
        Car car2 = new Car("Fiat");
        Car car3 = new Car("BMW");

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1.hashCode());*/

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("BMW"));
        carList.add(new Car("BMW"));
        carList.add(new Car("Fiat"));

        for (Car car: carList) {
            System.out.println(car.getBrand());
        }

        System.out.println(carList.contains(new Car("Fiat")));
    }
}
