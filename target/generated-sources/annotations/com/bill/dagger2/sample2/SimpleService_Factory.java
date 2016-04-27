package com.bill.dagger2.sample2;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum SimpleService_Factory implements Factory<SimpleService> {
  INSTANCE;

  @Override
  public SimpleService get() {
    return new SimpleService();
  }

  public static Factory<SimpleService> create() {
    return INSTANCE;
  }
}
