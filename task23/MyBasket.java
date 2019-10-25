package task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBasket implements Basket {
    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        MyBasket basket = new MyBasket();
        basket.addProduct("Шляпа", 5);
        basket.addProduct("Шарф", 3);
        basket.updateProductQuantity("Шарф", 2);
        basket.removeProduct("Шляпа");
        basket.getProducts();
        basket.getProductQuantity("Шляпа");
        basket.clear();
    }

    @Override
    public void addProduct(String product, int quantity) {
        for (int i = 0; i < quantity; i++)
            list.add(product);
    }

    @Override
    public void removeProduct(String product) {
        list.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (int i = 0; i < quantity; i++)
            list.add(product);
    }

    @Override
    public void clear() {
        for (int i = 0; i < list.size(); i++) {
            list.removeAll(MyBasket.list);
        }
    }

    @Override
    public void getProducts() {             //Должно быть List <String> getProducts?
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next().toString());
        }
        if (list.isEmpty()) {
            System.out.println("Корзина пуста");
        }
    }

    @Override
    public int getProductQuantity(String product) {
        int count = 0;
        for (String s : list) {
            if (s.equals(product)) {
                count++;
            }
        }
        System.out.println(count);      //Нужен ли вывод здесь:
        return count;
    }
}

