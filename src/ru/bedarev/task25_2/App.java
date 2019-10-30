package ru.bedarev.task25_2;

public class App {
    public static void main(String[] args) {
        MyBasket basket = new MyBasket();

        basket.addProduct("Шляпа", 3);
        basket.addProduct("Шарф", 2);
        basket.addProduct("Шлёпки", 1);
        System.out.println("Пополнили корзину\n" + basket.getProducts() + "\n");

        basket.removeProduct("Шляпа");
        System.out.println("Удаляем единицу товара *Шляпа*\n" + basket.getProducts() + "\n");

        basket.updateProductQuantity("Шлёпки", 2);
        System.out.println("Обновляем количество товара *Шлёпки*\n" + basket.getProducts() + "\n");

        System.out.println("Узнаем количество товара *Шляпа*\n" + basket.getProductQuantity("Шляпа") + "\n");

        basket.clear();
        System.out.println("Очистили корзину\n" + basket.getProducts());
    }
}
