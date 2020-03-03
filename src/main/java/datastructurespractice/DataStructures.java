package datastructurespractice;

import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
        List<String> mountainGoatsSongs = new ArrayList<>(
                Arrays.asList("Palmcorder Yajna",
                        "Going to Georgia",
                        "For Charles Bronson",
                        "Foreign Object",
                        "The Mess Inside",
                        "Sax Rohmer #1",
                        "You Were Cool",
                        "Song for my Stepfather",
                        "Tallahassee",
                        "The Diaz Brothers")
        );

        for (String song : mountainGoatsSongs) {
            System.out.println(song);
        }

        if(mountainGoatsSongs.contains("Palmcorder Yajna")) {
            System.out.println("'Palmcorder Yajna' is my favorite Mountain Goats song!");
        }

        Map<String, String> grades = new HashMap<String, String>();
        grades.put("Sofia", "A");
        grades.put("Julia", "B");
        grades.put("Nora", "C");
        grades.put("Numan", "C");
        grades.put("Maui", "A");

        System.out.println(grades);

        LinkedList<Integer> ints = new LinkedList<>(
                Arrays.asList(1, 2, 4, 4, 5)
        );
        ints.set(2, 3);
        System.out.println(ints);








    }
}

