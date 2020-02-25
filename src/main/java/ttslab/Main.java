package ttslab;

public class Main {
    public static void main(String[] args) {
        String str1 = "James";
        String str2 = "James";
        String str3 = "james";

        System.out.println(str1 == str2);
        //true

        System.out.println(str1.equals(str2));
        //true

        System.out.println(str1.equals(str3));
        //false

        System.out.println(str1.toLowerCase() == str3);
        //false

        String sentence = "I went to the market today and I bought eggs.";
        System.out.println(sentence.contains("and"));
        //true

        char char1 = sentence.replaceAll(" ", "").charAt(15);
        System.out.println(char1);
        // t

        int index = sentence.indexOf('u');
        System.out.println(index);
        // 35

        int index2 = sentence.lastIndexOf('c');
        System.out.println(index2);
        // -1 string does not contain 'c'

        int length = sentence.length();
        System.out.println(length);

        System.out.println(sentence.startsWith("The"));
        //false

        String intTemplate = "This is an integer: %d \n";
        System.out.printf(intTemplate, 22);

        Integer meaningOfLife = 42;
        Integer luckyNumber = Integer.parseInt("88");
        System.out.println(meaningOfLife + luckyNumber);




    }
}