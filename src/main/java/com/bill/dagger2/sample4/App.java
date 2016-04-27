package com.bill.dagger2.sample4;


import javax.inject.Inject;

/**
 * Created by bill_lv on 2016/4/25.
 */
public class App {

    @Inject
    Client client;

    public static void main(String[] args) {

        AppComponent appComponent = DaggerAppComponent.create();
        App app = new App();
        appComponent.inject(app);

        app.getClient().greet();
    }

    public Client getClient() {
        return client;
    }
}
