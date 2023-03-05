package br.edu.lucasdev.dataStructure.javastructures.queue;

import br.edu.lucasdev.dataStructure.javastructures.model.Car;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Car> carQueue = new LinkedList<>();

        carQueue.add(new Car("Ford"));
        carQueue.add(new Car("Toyota"));
        carQueue.add(new Car("Honda"));

        carQueue.remove();

        System.out.println(carQueue);
    }

}
