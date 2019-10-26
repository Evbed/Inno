package src.ru.bedarev.task08;

public class Calculator {

    private static int addition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    private static double addition(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }


    private static int subtraction(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
    private static double subtraction(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }


    private static int multiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    private static double multiplication(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }



    private static int division(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
    private static double division(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }



    private static int percent(int firstNum, int secondNum) {
        return (firstNum * secondNum) / 100;
    }
    private static double percent(double firstNum, double secondNum) {
        return (firstNum * secondNum) / 100;
    }

    public static void main(String[] args) {

        double a = 20.43;
        double b = 10.11;

        System.out.println(addition(a, b) + " Сложение");
        System.out.println(subtraction(a, b) + " Вычитание");
        System.out.println(multiplication(a, b) + " Умножение");
        System.out.println(division(a, b) + " Деление");
        System.out.println(percent(a, b) + " Процент");


    }
}
