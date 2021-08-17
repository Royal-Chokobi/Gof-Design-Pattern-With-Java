package com.design.pattern.singletonPattern;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("singleton1 = " + singleton1);
        System.out.println("singleton2 = " + singleton2);
        System.out.println("(singleton1==singleton2) = " + (singleton1==singleton2));

        Singleton singleton3 = Singleton.getSafeInstance();
        Singleton singleton4 = Singleton.getSafeInstance();

        System.out.println("singleton3 = " + singleton3);
        System.out.println("singleton4 = " + singleton4);
        System.out.println("(singleton3==singleton4) = " + (singleton3==singleton4));

        SampleInstance sampleInstance1 = new SampleInstance();
        SampleInstance sampleInstance2 = new SampleInstance();

        System.out.println("sampleInstance1 = " + sampleInstance1);
        System.out.println("sampleInstance2 = " + sampleInstance2);
        System.out.println("(sampleInstance1 == sampleInstance2) = " + (sampleInstance1 == sampleInstance2));

    }
}
