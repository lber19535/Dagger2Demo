package com.bill.dagger2.official;

import javax.inject.Inject;

/**
 * Created by bill_lv on 2016/4/21.
 */
public class Thermosiphon implements  Pump {

    private Heater heater;

    @Inject
    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
