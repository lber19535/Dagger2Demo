package com.bill.dagger2.official;

/**
 * Created by bill_lv on 2016/4/21.
 */
public class ElectricHeater implements Heater {
    boolean heating;

    public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    public void off() {
        this.heating = false;
    }

    public boolean isHot() {
        return heating;
    }
}
