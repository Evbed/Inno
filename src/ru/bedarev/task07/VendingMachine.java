package ru.bedarev.task07;


public class VendingMachine {

    private String name;
    private Drink[] drinks;
    private int balance = 0;

    public Drink[] getDrinks() {
        return drinks;
    }

    public int getBalance() {
        return balance;
    }

    public int addCash(int cash) {
        balance += cash;
        return balance;

    }

    public Drink giveOut(int choice) throws NotEnoughMoneyException, WrongCommandException {
        switch (choice) {
            case 0:
                if (balance > Drink.PEPSI.getCost() && balance != 0) {
                    balance -= Drink.PEPSI.getCost();
                    return Drink.PEPSI;

                } else {
                    throw new NotEnoughMoneyException();

                }
            case 1:
                if (balance > Drink.MIRINDA.getCost() && balance != 0) {
                    balance -= Drink.MIRINDA.getCost();
                    return  Drink.MIRINDA;
                } else {
                    throw new NotEnoughMoneyException();
                }
            case 2:
                if (balance > Drink.SEVENUP.getCost() && balance != 0) {
                    balance -= Drink.SEVENUP.getCost();
                    return Drink.SEVENUP;
                } else {
                    throw new NotEnoughMoneyException();
                }

            default:
                throw new WrongCommandException();
        }

    }

    public VendingMachine(String name, Drink... drinks) {
        this.drinks = drinks;
        this.name = name;
    }
}






