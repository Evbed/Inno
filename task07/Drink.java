package task07;

public enum Drink {
    PEPSI("Пепси-кола", 30) , FANTA("Фанта", 35), SPRITE("Спрайт",40);

    public String title;
    public int cost;

    Drink(String title, int cost) {
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }





}