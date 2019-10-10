package task07;


public class VendingMachine {

    private String name;
    private Drink[] drinks;
    static int balance = 0;

    public static int getBalance(int cash) {
        System.out.println("Внесите купюры");
        balance += cash;
        return balance;

    }

    public static int getDrink(int choice) {
        switch (choice) {
            case 0:
                if (balance > Drink.PEPSI.getCost() && balance != 0) {

                    System.out.println("Возьмите ваш напитоk");
                    getBalance(-(Drink.PEPSI.getCost()));
                    break;
                } else {
                    System.out.println("Недостаточно средств!");
                }
            case 1:
                if (balance > Drink.MIRINDA.getCost() && balance != 0) {
                    System.out.println("Возьмите ваш напитоk");
                    getBalance(-(Drink.MIRINDA.getCost()));
                    break;
                } else {
                    System.out.println("Недостаточно средств!");
                }
            case 2:
                if (balance > Drink.SEVENUP.getCost() && balance != 0) {
                    System.out.println("Возьмите ваш напитоk");
                    getBalance(-(Drink.SEVENUP.getCost()));
                    break;
                } else {
                    System.out.println("Недостаточно средств!");
                }
                break;
        }
        return choice;
    }

    public VendingMachine(String name, Drink... drinks) {
        this.drinks = drinks;
        this.name = name;
    }


    public void menu() {
        System.out.println("Меню:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(i + " - " + drinks[i].getTitle() + " - " + drinks[i].getCost() + " рублей");
        }
        control();
    }

    public void control() {

        System.out.println("******************************");
        System.out.println("add  - Добавить купюры");
        System.out.println("go   - Перейти к выбору напитка");
        System.out.println("exit - Закончить покупку");


    }


}






