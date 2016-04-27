package com.bill.dagger2.official;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bill_lv on 2016/4/21.
 */
@Module
public class PumpModule {

    @Provides
    @PumpScope
    Pump providePump(Thermosiphon pump){
        return pump;
    }

    @Provides
    int provideInt(){
        return 3;
    }
}
