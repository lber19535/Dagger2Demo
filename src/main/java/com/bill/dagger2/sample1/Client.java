package com.bill.dagger2.sample1;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by bill_lv on 2016/4/25.
 */
@Singleton
public class Client {

    private Service service;

    @Inject
    public Client(SimpleService service) {
        this.service = service;
    }

//    @Inject
//    public void setService(Service service) {
//        this.service = service;
//    }

    public void greet() {
        System.out.println("hello " + service.getServiceName() + service);
    }

}
