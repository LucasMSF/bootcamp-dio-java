package br.edu.lucasdev.dataStructure.queue;

import br.edu.lucasdev.dataStructure.node.Node;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enQueue("Lucas");
        queue.enQueue("Maria");
        queue.enQueue("Joana");

        queue.deQueue();
        queue.deQueue();

        System.out.println(queue);
    }
}
