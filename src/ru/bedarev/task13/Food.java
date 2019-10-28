package ru.bedarev.task13;

public enum Food {
    COOKIE("Печенье"), CANDY("Конфета"), SOUP("Суп"), CARROT("Морковь");

    private String title;

    Food(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    static void menu() {
        System.out.println("Чем кормим ребенка?");
        System.out.println(Food.COOKIE.getTitle());
        System.out.println(Food.CANDY.getTitle());
        System.out.println(Food.SOUP.getTitle());
        System.out.println(Food.CARROT.getTitle());

    }


}
