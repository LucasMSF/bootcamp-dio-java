package br.edu.lucasdev.dataStructure.circularList;

public class Main {
    public static void main(String[] args) {
        CircularList<String> list = new CircularList<>();

        list.get(1);

        list.add("Chaves");
        list.add("Chiquinha");
        list.add("Kiko");
        list.add("Seu Madruga");
        list.add("Seu Barriga");

        list.remove(0);

        System.out.println(list);
        System.out.println(list.get(4));
    }
}
