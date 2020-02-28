package HR;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String a = "         ";
        String s = a.trim();
        String[] strArr = s.split("\\P{Alpha}+", 0);

        if(s == null){
            System.out.println(0);
        } else {
            System.out.println("array length: " + strArr.length);
            System.out.println(strArr[0]);

            for (String str : strArr) {
                System.out.println("string is: " + str);
            }
        }

    }
}
