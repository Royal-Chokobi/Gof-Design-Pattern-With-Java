package com.design.pattern.templateMethodPattern;

public class Main {
    public static void main(String[] args) {
        MysqlDBConnect mysqlDBConnect = new MysqlDBConnect();
        OracleDBConnect oracleDBConnect = new OracleDBConnect();

        mysqlDBConnect.run();
        System.out.println("======================");
        oracleDBConnect.run();

    }
}
