package com.arturmkrtchyan.sizeof4j.calculation;

public class AgentCalculationStrategy implements CalculationStrategy {

    @Override
    public <T> int calculateShallow(Class<T> clazz) {
        return 0;
    }
}