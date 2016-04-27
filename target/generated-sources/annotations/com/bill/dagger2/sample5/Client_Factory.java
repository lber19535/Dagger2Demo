package com.bill.dagger2.sample5;

import com.bill.dagger2.sample3.Service;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Client_Factory implements Factory<Client> {
  private final Provider<Service> serviceProvider;

  public Client_Factory(Provider<Service> serviceProvider) {
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Client get() {
    return new Client(serviceProvider.get());
  }

  public static Factory<Client> create(Provider<Service> serviceProvider) {
    return new Client_Factory(serviceProvider);
  }
}
