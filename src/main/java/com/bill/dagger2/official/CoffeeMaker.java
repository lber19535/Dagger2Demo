package com.bill.dagger2.official;

import dagger.Lazy;

import javax.inject.Inject;

/**
 * Created by bill_lv on 2016/4/21.
 */
public class CoffeeMaker {

    private Lazy<Heater> heater;
    public Pump pump;

    @Inject
    public CoffeeMaker(Lazy<Heater> heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.get().off();
    }
}
