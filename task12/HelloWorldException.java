package task12;

public class HelloWorldException {

    static String text = "Hello World!";
    static int[] array = new int[2];

    public static void main(String[] args) throws MyException {

        try {
            text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        if (text == null)
            throw new MyException("Сработало наше исключение");
    }
}