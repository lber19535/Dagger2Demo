package com.bill.dagger2.official;

import javax.inject.Scope;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by bill_lv on 2016/4/21.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PumpScope {
}
