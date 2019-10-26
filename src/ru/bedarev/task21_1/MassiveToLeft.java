package src.ru.bedarev.task21_1;

public class MassiveToLeft {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}};

        toLeft(arr);
        show(arr);
    }

    private static void toLeft(int[][] arr) {       //метод сортировки
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {

                arr[i][j] = arr[i][j + 1];
            }
        }
        arr[0][arr[0].length - 1] = 0;      //костыль?
        arr[1][arr[1].length - 1] = 0;
    }

    private static void show(int[][] arr) {     //метод вывода на экран итога сортировки
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }
    }
}





