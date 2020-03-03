package stackpractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> fruitStack = new Stack<>();
        fruitStack.push("mangoes");
        fruitStack.push("clementines");
        fruitStack.push("berries");
        fruitStack.push("pineapples");
        fruitStack.push("peaches");

        fruitStack.pop();
        fruitStack.pop();

        System.out.println(fruitStack.peek());
        // berries

        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Java");
        myQueue.add("JavaScript");
        myQueue.add("Ruby");
        myQueue.add("Python");
        myQueue.add("C++");

        myQueue.remove();
        myQueue.remove();

        System.out.println(myQueue.element());
        System.out.println(myQueue.peek());
        // Ruby
    }






}
