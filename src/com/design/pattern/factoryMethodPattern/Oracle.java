package com.design.pattern.factoryMethodPattern;

public class Oracle implements DataBase {
    @Override
    public void DBConnect() {
        System.out.println("Oracle DB Connect");
    }

    @Override
    public void Commit() {
        System.out.println("Oracle DB Commit");
    }
}
