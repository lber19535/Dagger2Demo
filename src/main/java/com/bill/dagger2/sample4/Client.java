package com.bill.dagger2.sample4;

import com.bill.dagger2.sample3.Service;
import com.bill.dagger2.sample3.SimpleService;

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

//    @Inject
//    public void setApp(App app){
//        System.out.println("xxx");
//    }

    @Inject
    public void setService(Service service) {
        this.service = service;
    }

    public void greet() {
        System.out.println("hello " + service.getServiceName());
    }

}
