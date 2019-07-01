package com.example.factory.leifeng;

public class LeiFengApplication {
    public static void main(String[] args) {
        FactoryInterface factoryInterface = new VolunteerFactory();
        LeiFeng leiFeng = factoryInterface.createLeiFeng();

        leiFeng.Sweep();
        leiFeng.Buy();
        leiFeng.Wash();
    }
}
