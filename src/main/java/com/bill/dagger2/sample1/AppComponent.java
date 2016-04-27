package com.bill.dagger2.sample1;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by bill_lv on 2016/4/25.
 */
@Singleton
@Component
public interface AppComponent {
    Client makeClient();
}
