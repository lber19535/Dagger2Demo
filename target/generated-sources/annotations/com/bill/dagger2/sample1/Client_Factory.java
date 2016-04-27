package com.bill.dagger2.sample1;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Client_Factory implements Factory<Client> {
  private final Provider<SimpleService> serviceProvider;

  public Client_Factory(Provider<SimpleService> serviceProvider) {
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Client get() {
    return new Client(serviceProvider.get());
  }

  public static Factory<Client> create(Provider<SimpleService> serviceProvider) {
    return new Client_Factory(serviceProvider);
  }
}
