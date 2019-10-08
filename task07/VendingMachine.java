package task07;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class VendingMachine {
    private final static Logger logger = LoggerFactory.getLogger(VendingMachine.class);
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



