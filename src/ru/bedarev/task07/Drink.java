package src.ru.bedarev.task07;

public enum Drink {
    PEPSI("Пепси-кола", 30), FANTA("Фанта", 35), SPRITE("Спрайт", 40),
    COCA_COLA("Кола", 50), MIRINDA("Миринда", 45), SEVENUP("Севен Ап", 50);

    private String title;
    private int cost;

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
