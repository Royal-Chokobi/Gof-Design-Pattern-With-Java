package com.design.pattern.templateMethodPattern;

public class OracleDBConnect extends AbstDBConnect{
    public OracleDBConnect() {
        super.DBTYPE = "Oracle";
    }

    @Override
    protected void dbConnection() {
        System.out.println("Oracle Connect~~");
    }
}
