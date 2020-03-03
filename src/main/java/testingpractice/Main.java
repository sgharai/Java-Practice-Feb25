package testingpractice;

public class Main {
    public int add(int a, int b){
        return a + b;
    }

    public int divide(int a, int b){
        return a /b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public String name(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public void throwsException() throws Exception {
        throw new Exception();
    }
}
