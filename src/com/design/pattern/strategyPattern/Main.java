package com.design.pattern.strategyPattern;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        client.startAlgorithm();

        client.setStrategyInterface(new StrategyA());
        client.startAlgorithm();

        client.setStrategyInterface(new StrategyB());
        client.startAlgorithm();

        client.setStrategyInterface(new StrategyC());
        client.startAlgorithm();
    }
}
