package ru.bedarev.task23;

public class App {
    public static void main(String[] args) {

        MyBasket basket = new MyBasket();
        basket.addProduct("Шляпа", 2);
        basket.addProduct("Шaрф", 3);

        System.out.println("Товары в корзине:");
        basket.getProducts();

        basket.removeProduct("Шaрф");
        System.out.println(basket.getProductQuantity("Шляпа"));
        basket.updateProductQuantity("Шляпа", 10);

        System.out.println("Товары в корзине:");
        basket.getProducts();

        basket.clear();
        System.out.println("Товары в корзине:");
        basket.getProducts();
    }
}
