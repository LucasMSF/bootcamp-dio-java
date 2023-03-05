package br.edu.lucasdev.dataStructure.javastructures.stack;

import br.edu.lucasdev.dataStructure.javastructures.model.Car;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Car> carStack = new Stack<>();

        carStack.push(new Car("Ford"));
        carStack.push(new Car("chevrolet"));
        carStack.push(new Car("Nissan"));
        carStack.push(new Car("Toyota"));

        System.out.println(carStack);
    }
}
