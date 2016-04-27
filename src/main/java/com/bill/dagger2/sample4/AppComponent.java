package com.bill.dagger2.sample4;

import com.bill.dagger2.sample3.ServiceModule;
import dagger.Component;

/**
 * Created by bill_lv on 2016/4/25.
 */
@Component(modules = ServiceModule.class)
public interface AppComponent {
    Client makeClient();
    void inject(App app);
}
