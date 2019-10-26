package src.ru.bedarev.task08;


public class Act {
    private int number;
    private String date;

    public Act(Contract contract) {
    number = contract.getNumber();
    date = contract.getDate();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
