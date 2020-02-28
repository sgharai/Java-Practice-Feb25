package lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson {

    public static void main(String[] args) {
        // writing out method
        FunctionalInterface functionalInterface = new FunctionalInterface() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + b);
            }
        };
        functionalInterface.add(1, 2);

        // lambda
        FunctionalInterface functionalInterface1 = (int a, int b ) -> System.out.println(a + b);
        functionalInterface1.add(2, 3);

        // streams
        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            integerList.add(i);
        }

        integerList.stream().map(el -> el + 5).forEach(System.out::println);
        System.out.println(integerList.stream().collect(Collectors.summingInt(Integer::intValue)));

        //can directly declare a stream
        Stream<Integer> integerStream = integerList.stream();
        Stream<Integer> integerStream2 = integerList.stream();
        integerStream.map(el -> el + 5).forEach(System.out::println);
        integerStream2.filter(el -> el % 2 != 0).forEach(System.out::println);

        int sum = Arrays.stream(new int[]{1, 2, 3}).sum();
        System.out.println(sum);

        int sum2 = Arrays.stream(new int[]{4,5,6}).reduce(0,
                (element1, element2) -> element1 + element2);
        System.out.println(sum2);


    }
}
