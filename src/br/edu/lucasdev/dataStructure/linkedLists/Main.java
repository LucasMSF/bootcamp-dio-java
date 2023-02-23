package br.edu.lucasdev.dataStructure.linkedLists;

public class Main {
    public static void main(String[] args) {
        //Linked List
        LinkedList<String> list = new LinkedList<>();

        list.add("Lucas");
        list.add("Maria");
        list.add("Roberta");
        list.add("Julia");

        System.out.println("LENGTH OF LIST: " + list.size());
        System.out.println(list);

        System.out.println(list.get(3));

        list.remove(2);
        list.remove(0);

        list.add("Antediguemon");

        System.out.println(list);

        // Double Linked List
        DoubleLinkedList<Integer> Doublelist = new DoubleLinkedList<>();

        Doublelist.add(1);
        Doublelist.add(2);
        Doublelist.add(3);
        Doublelist.add(4);
        Doublelist.add(5);

        Doublelist.remove(4);
        Doublelist.remove(0);

        Doublelist.add(10);
        Doublelist.add(20, 1);

        System.out.println(Doublelist);
        System.out.println(Doublelist.get(0));
    }
}
