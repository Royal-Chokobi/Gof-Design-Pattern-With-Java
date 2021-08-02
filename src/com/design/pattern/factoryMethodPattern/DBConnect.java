package com.design.pattern.factoryMethodPattern;

public abstract class DBConnect {

    final public DataBase run(){
        DataBase db;
        db = dataBase();
        select();
        print();
        return db;
    }

    protected abstract DataBase dataBase();
    protected abstract void select();
    protected abstract void print();

}
