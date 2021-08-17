package com.design.pattern.singletonPattern;

public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    //=======================================================================

    private static class InnerInstance{
        private static final Singleton singletonInstance = new Singleton();
    }

    public static Singleton getSafeInstance() {
        return InnerInstance.singletonInstance;
    }


}
