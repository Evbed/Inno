package ru.bedarev.task25_2;


import java.util.*;

public class MyBasket implements Basket {
    private Map<String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getKey().equals(product)) {
                map.put(product, pair.getValue() - 1);
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        map.put(product, quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            for (int i = 0; i < pair.getValue(); i++) {
                list.add(pair.getKey());
            }
        }
        return list;
    }

    @Override
    public int getProductQuantity(String product) {
       return map.get(product);
    }
}
