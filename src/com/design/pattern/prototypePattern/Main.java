package com.design.pattern.prototypePattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cafe cafe1 = new Cafe(1, new CoffeeMenu("아이스 아메리카노", 3000));
        Cafe cafe2 = (Cafe) cafe1.clone();

        System.out.println("cafe1.toString() = " + cafe1.toString());
        System.out.println("cafe2.toString() = " + cafe2.toString());

        cafe1.getCoffeeMenu().setMenu("믹스커피");
        cafe1.getCoffeeMenu().setPrice(200);

        System.out.println("cafe1.toString() = " + cafe1.toString());
        System.out.println("cafe2.toString() = " + cafe2.toString());

        Cafe cafe3 = new Cafe(1, new CoffeeMenu("아메리카노", 3000));
        Cafe cafe4 = (Cafe) cafe3.deepCopy();

        System.out.println("cafe3.toString() = " + cafe3.toString());
        System.out.println("cafe4.toString() = " + cafe4.toString());

        cafe3.getCoffeeMenu().setMenu("블랙커피");
        cafe3.getCoffeeMenu().setPrice(500);

        System.out.println("cafe3.toString() = " + cafe3.toString());
        System.out.println("cafe4.toString() = " + cafe4.toString());

    }
}
