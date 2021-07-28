package com.design.pattern.strategyPattern;

public class Client {
    private StrategyInterface strategyInterface;

    public void startAlgorithm(){
        if(strategyInterface == null){
            System.out.println("Null Strategy");
        }else {
            strategyInterface.AbstractAlgorithm();
        }
    }

    public void setStrategyInterface(StrategyInterface strategyInterface) {
        this.strategyInterface = strategyInterface;
    }
}
