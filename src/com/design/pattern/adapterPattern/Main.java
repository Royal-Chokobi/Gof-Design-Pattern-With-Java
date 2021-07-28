package com.design.pattern.adapterPattern;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println("adapter.half(100f) = " + adapter.halfOf(100f));
        System.out.println("adapter.twice(200f) = " + adapter.twiceOf(200f));
    }
}
