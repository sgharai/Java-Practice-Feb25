package arraypractice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student angela = new Student("Angela", "History",1);
        Student joe = new Student("Joe","Finance", 2);
        Student chloe = new Student("Chloe", "Graphic Design", 3);
        studentList.add(angela);
        studentList.add(joe);
        studentList.add(chloe);

        studentList.stream().map(student -> student.toString()).forEach(System.out::println);



    }
}