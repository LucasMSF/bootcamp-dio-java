package br.edu.lucasdev.dataStructure.node;

public class Main {
    public static void main(String[] args) {
        Node<String> nodeOne = new Node<>("First Node");
        Node<String> nodeTwo = new Node<>("Second Node");
        Node<String> nodeThree = new Node<>("Third Node");

        nodeOne.setNode(nodeTwo);
        nodeTwo.setNode(nodeThree);

        System.out.println(nodeOne);
        System.out.println(nodeOne.getNode());
    }

}
