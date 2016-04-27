package com.bill.dagger2.sample3;

import dagger.Component;

/**
 * Created by bill_lv on 2016/4/25.
 */
@Component(modules = ServiceModule.class)
public interface AppComponent {
    Client makeClient();
}
