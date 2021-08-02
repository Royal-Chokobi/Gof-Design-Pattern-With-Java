package com.design.pattern.templateMethodPattern;

public class MysqlDBConnect extends AbstDBConnect{

    public MysqlDBConnect() {
        super.DBTYPE="MySQL";
    }

    @Override
    protected void dbConnection() {
        System.out.println("MySQL Connect~~");
    }
}
