package com.bill.dagger2.sample3;

import javax.inject.Inject;

/**
 * Created by bill_lv on 2016/4/25.
 */
public class SimpleService implements Service {

    private static final String TAG = "SimpleService";

    private String scope = "";

    @Inject
    public SimpleService() {
    }

    public static String getTAG() {
        return TAG;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getServiceName() {
        return TAG + scope + " ";
    }
}
