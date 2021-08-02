package com.design.pattern.factoryMethodPattern;

public class OracleCreator extends DBConnect {

    @Override
    protected DataBase dataBase() {
        var oracle = new Oracle();
        oracle.DBConnect();
        return oracle;
    }

    @Override
    protected void select() {
        System.out.println("Oracle Select * From DB");
    }

    @Override
    protected void print() {
        System.out.println("Oracle 실행 결과 출력");
    }
}
