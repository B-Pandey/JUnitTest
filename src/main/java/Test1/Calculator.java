package Test1;

public class Calculator {
    static int value = 100;

    public Calculator(int i) {
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
    public static void subtract(int number){
        value -= number;
    }

    static String toUpperCase(String input){
        return input.toUpperCase();
    }
}
