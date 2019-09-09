package task02;

public class TimeConvert {
    public static void main(String[] args) {
        int seconds = Integer.parseInt(args[0]);    //ищем число в указанных аргументах прграммы
        int convert = seconds / 60 / 60;

        System.out.println(convert);
    }
}
