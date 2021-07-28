package com.design.pattern.adapterPattern;

public class AdapterImpl implements Adapter{
    @Override
    public Double halfOf(Float f) {
        return Math.half(f);
    }

    @Override
    public Double twiceOf(Float f) {
        return Math.doubled(f.doubleValue());
    }
}
