package com.bill.dagger2.sample2;

import javax.inject.Inject;

/**
 * Created by bill_lv on 2016/4/25.
 */
public class SimpleService implements Service {

    private static final String TAG = "SimpleService";

    @Inject
    public SimpleService() {
    }

    public String getServiceName() {
        return TAG;
    }
}
