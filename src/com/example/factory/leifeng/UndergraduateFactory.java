package com.example.factory.leifeng;

public class UndergraduateFactory implements FactoryInterface {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
