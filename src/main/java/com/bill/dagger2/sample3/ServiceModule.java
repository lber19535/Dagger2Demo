package com.bill.dagger2.sample3;

import dagger.Module;
import dagger.Provides;

/**
 * Created by bill_lv on 2016/4/25.
 */
@Module
public class ServiceModule {

    @Provides
    static Service provideSimpleService(SimpleService service) {
        return service;
    }
}
