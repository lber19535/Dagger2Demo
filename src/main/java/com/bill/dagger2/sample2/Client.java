package com.bill.dagger2.sample2;

import javax.inject.Inject;

/**
 * Created by bill_lv on 2016/4/25.
 */
public class Client {

    private Service service;

    public Client(SimpleService service) {
        this.service = service;
    }

    @Inject
    public Client() {
    }

    @Inject
    public void setService(Service service) {
        this.service = service;
    }

    public void greet() {
        System.out.println("hello " + service.getServiceName());
    }

}
