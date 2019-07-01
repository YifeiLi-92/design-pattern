package com.example.factory.leifeng;

public class VolunteerFactory implements FactoryInterface {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
