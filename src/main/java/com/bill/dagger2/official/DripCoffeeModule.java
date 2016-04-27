package com.bill.dagger2.official;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bill_lv on 2016/4/21.
 */
@Module(includes = PumpModule.class)
public class DripCoffeeModule {

    @Provides
    static Heater provideHeater(){
        return new ElectricHeater();
    }
}
