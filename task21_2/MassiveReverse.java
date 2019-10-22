package task21_2;

public class MassiveReverse {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {      //заполняем массив
            arr[i] = i * 10;
        }

        System.out.println("Массив до сортировки:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        MassiveReverse.reverse(arr);            //Метод сортировки массива
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }

        System.out.println("\n" + "Массив после сортировки:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
