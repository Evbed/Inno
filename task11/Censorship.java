package task11;

import java.util.Scanner;

public class Censorship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String censoredUserInput = userInput.replaceAll(" бяка", " Вырезано цензурой");
        System.out.println(censoredUserInput);

    }
}


