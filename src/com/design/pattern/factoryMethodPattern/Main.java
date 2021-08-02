package com.design.pattern.factoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        DBConnect connect;

        connect= new MySqlCreator();
        var run = connect.run();
        run.Commit();

        System.out.println("====================");

        connect= new OracleCreator();
        run = connect.run();
        run.Commit();
    }
}
