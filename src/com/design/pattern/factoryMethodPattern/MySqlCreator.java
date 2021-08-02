package com.design.pattern.factoryMethodPattern;


public class MySqlCreator extends DBConnect {

    @Override
    protected DataBase dataBase() {
        MySQL mySQL = new MySQL();
        mySQL.DBConnect();
        return mySQL;
    }

    @Override
    protected void select() {
        System.out.println("MySQL Select * From DB");
    }

    @Override
    protected void print() {
        System.out.println("MySQL 실행 결과 출력");
    }
}
