package task07;

public class VendingMachine {
    private String name;
    private Drink[] drinks;

    public VendingMachine(String name, Drink... drinks) {
        this.drinks = drinks;
        this.name = name;
    }

    public void menu() {
        for (Drink d : drinks) {
            System.out.println("Номер " + d.ordinal() + " - " + d.getTitle() + " - " + d.getCost() + " рублей");
        }
    }
}



