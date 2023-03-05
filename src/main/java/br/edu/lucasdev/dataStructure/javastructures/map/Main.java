package br.edu.lucasdev.dataStructure.javastructures.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("name", "Lucas");
        people.put("age", "18");

        Map<String, String> people2 = new HashMap<>();
        people2.put("name", "Maria");
        people2.put("age", "12");

        List<Map<String, String>> mapList = new ArrayList<>();

        mapList.add(people);
        mapList.add(people2);

        System.out.println(mapList);
    }
}
