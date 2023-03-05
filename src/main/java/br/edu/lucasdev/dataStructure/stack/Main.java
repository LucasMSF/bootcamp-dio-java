package br.edu.lucasdev.dataStructure.stack;

import br.edu.lucasdev.dataStructure.node.Node;

public class Main {
    public static void main(String[] args) {
        Node<Integer> nodeOne = new Node<>(1);
        Node<Integer> nodeTwo = new Node<>(2);
        Node<Integer> nodeThree = new Node<>(3);

        Stack<Integer> stack = new Stack<>();

        stack.push(nodeOne);
        stack.push(nodeTwo);
        stack.push(nodeThree);

//        stack.pop();

        System.out.println(stack);

    }
}
