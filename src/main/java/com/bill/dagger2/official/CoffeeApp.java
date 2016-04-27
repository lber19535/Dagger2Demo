package com.bill.dagger2.official;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by bill_lv on 2016/4/21.
 */
public class CoffeeApp {

    public static void main(String[] args) {

        Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
        coffee.maker().brew();
        System.out.println(coffee.maker().pump);
        System.out.println(coffee.maker().pump);
        System.out.println(coffee.maker().pump);
    }

    @Singleton
    @PumpScope
    @Component(modules = {DripCoffeeModule.class})
    public interface Coffee {
        CoffeeMaker maker();
    }

}
