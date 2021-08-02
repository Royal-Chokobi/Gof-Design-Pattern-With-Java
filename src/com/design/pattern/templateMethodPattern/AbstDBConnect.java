package com.design.pattern.templateMethodPattern;

public abstract class AbstDBConnect {

    protected String DBTYPE;

    final void run(){
        dbConnection();
        select();
        print();
    }

    protected abstract void dbConnection();

    protected void select(){
        System.out.println(DBTYPE + " Select 쿼리 실행");
    }
    protected void print(){
        System.out.println(DBTYPE + " Hello world");
    }

}
