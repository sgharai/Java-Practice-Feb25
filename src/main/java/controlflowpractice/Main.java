package controlflowpractice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;

        if(isTrue) {
            System.out.println("This is running because isTrue is true.");
        }

        int[] ints = {1, 2, 3};

        for(int integer : ints){
            System.out.println(integer + 2);
        }

        Arrays.stream(ints).map(item -> item + 10).forEach(System.out::println);

        int lattes = 0;
        do {
            System.out.println(lattes  + " lattes consumed.");
            lattes++;
        } while (lattes < 10);

        String villain = "Hades";
        switch(villain) {
            case "Sauron":
                System.out.println("Okay");
                break;
            case "Loki":
                System.out.println("Meh");
                break;
            case "Hades":
                System.out.println("Bada bing bada boom");
                break;
            default:
                System.out.println("I need a hero");
                break;






        }


    }
}
