package br.edu.lucasdev.dataStructure.javastructures.arrayList;

import br.edu.lucasdev.dataStructure.javastructures.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(Arrays.asList(
                new Car("Fiat"),
                new Car("Honda"),
                new Car("BMW")
            )
        );

        System.out.println(carList.contains(new Car("Honda")));
        System.out.println(carList.get(2));
        System.out.println(carList);
    }
}
