package com.bill.dagger2.sample2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bill_lv on 2016/4/25.
 */
@Module
public class ServiceModule {

    @Provides
    public Service provideSimpleService(SimpleService service) {
        return service;
    }
}
