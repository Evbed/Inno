package ru.bedarev.Task06;

class CarPrice {
    public static void main(String[] args) {

        Sedan impreza = new Sedan(false, 95);
        Universal outback = new Universal(true, 150);
        Crossover tribeca = new Crossover(true, 250);


        System.out.println(impreza.cost() + " $");
        System.out.println(outback.cost() + " $");
        System.out.println(tribeca.cost() + " $");


    }
}