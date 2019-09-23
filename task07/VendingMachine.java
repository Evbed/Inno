package task07;

public class VendingMachine {

    public void menu() {
        for (Drink d : Drink.values()) {
            System.out.println("Номер " + d.ordinal() + " - " + d.getTitle() + " - " + d.getCost() + " рублей");
        }
    }
}



