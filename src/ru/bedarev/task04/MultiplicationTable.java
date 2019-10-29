package ru.bedarev.task04;



public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j < 11; j++) {
                int format = i * j;
                if (format < 10) {
                    System.out.print(format + "  ");
                } else {
                    System.out.print(format + " ");
                }


            }
        }
    }
}

