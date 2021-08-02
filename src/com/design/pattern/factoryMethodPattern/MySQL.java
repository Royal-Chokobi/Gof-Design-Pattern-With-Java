package com.design.pattern.factoryMethodPattern;

public class MySQL implements DataBase {
    @Override
    public void DBConnect() {
        System.out.println("MySQL DB Connect");
    }

    @Override
    public void Commit() {
        System.out.println("MySQL DB Commit");
    }
}
