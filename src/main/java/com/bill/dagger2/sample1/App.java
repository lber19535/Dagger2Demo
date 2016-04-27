package com.bill.dagger2.sample1;


/**
 * Created by bill_lv on 2016/4/25.
 */
public class App {

    public static void main(String[] args) {

        AppComponent appComponent = DaggerAppComponent.create();
        Client client = appComponent.makeClient();
        Client client1 = appComponent.makeClient();
        client.greet();
        client1.greet();

    }
}
