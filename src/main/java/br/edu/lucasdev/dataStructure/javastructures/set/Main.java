package br.edu.lucasdev.dataStructure.javastructures.set;

import br.edu.lucasdev.dataStructure.javastructures.model.Car;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Car> carHashSet = new HashSet<>();

        carHashSet.add(new Car("BMW"));
        carHashSet.add(new Car("Porche"));
        carHashSet.add(new Car("Lexus"));

        System.out.println(carHashSet);

        Set<Car> carTreeSet = new TreeSet<>();

        carTreeSet.add(new Car("BMW"));
        carTreeSet.add(new Car("Porche"));
        carTreeSet.add(new Car("Lexus"));

        System.out.println(carTreeSet);
    }

}
