package br.edu.lucasdev.dataStructure.linkedLists;

public class Main {
    public static void main(String[] args) {
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
    }
}
