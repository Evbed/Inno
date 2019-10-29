package ru.bedarev.task07;


public class VendingMachine {

    private String name;
    public static Drink[] drinks;
    private int balance = 0;

    public int getBalance() {
        return balance;
    }

    public int addCash(int cash) {
        balance += cash;
        return balance;

    }

    public int getDrink(int choice) throws NotEnoughMoneyException, WrongCommandException {
        switch (choice) {
            case 0:
                if (balance > Drink.PEPSI.getCost() && balance != 0) {

                    balance -= Drink.PEPSI.getCost();
                    break;
                } else {
                    throw new NotEnoughMoneyException();

                }
            case 1:
                if (balance > Drink.MIRINDA.getCost() && balance != 0) {
                    balance -= Drink.MIRINDA.getCost();
                    break;
                } else {
                    throw new NotEnoughMoneyException();
                }
            case 2:
                if (balance > Drink.SEVENUP.getCost() && balance != 0) {
                    balance -= Drink.SEVENUP.getCost();
                    break;
                } else {
                    throw new NotEnoughMoneyException();
                }

            default:
                throw new WrongCommandException();
        }
        return choice;
    }

    public VendingMachine(String name, Drink... drinks) {
        this.drinks = drinks;
        this.name = name;
    }
}






