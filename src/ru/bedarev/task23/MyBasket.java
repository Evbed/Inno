package ru.bedarev.task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyBasket implements Basket {
    private List<String> list = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        for (int i = 0; i < quantity; i++)
            list.add(product);
    }

    @Override
    public void removeProduct(String product) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String nextList = iterator.next();
            if (nextList.equals(product)) {
                iterator.remove();
                break;
            }
        }
    }


    @Override
    public void updateProductQuantity(String product, int quantity) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String nextList = iterator.next();
            if (nextList.equals(product)) {
                iterator.remove();
            }
        }
        for (int i = 0; i < quantity; i++)
            list.add(product);
    }

    @Override
    public void clear() {
        while (!list.isEmpty()) {
            list.remove(list.get(0));
        }
    }

    @Override
    public List<String> getProducts() {
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next().toString());
        }
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
        int count = 0;
        for (String s : list) {
            if (s.equals(product)) {
                count++;
            }
        }
        return count;
    }
}

