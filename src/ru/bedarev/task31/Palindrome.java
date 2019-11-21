package ru.bedarev.task31;

public class Palindrome {
    public static void main(String[] args) {
        String line = "мадам";
        String line2 = "шалаш";
        System.out.println("[Метод строки] Переданное слово палиндром?  - " + isPalindrome(line));
        System.out.println("[Проверка с концов строки] Переданное слово палиндром? - " + isPalindrome2(line2));
    }

    private static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString()); //проверка на аналогичность развернутого слова
    }

    private static boolean isPalindrome2(String s) {
        for (int i = 0; i < s.length() / 2; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {  /*проверка на равенство первого и последнего символов
                                                                со смещение к центру слова*/
                return false;
            }
        }
        return true;
    }
}
