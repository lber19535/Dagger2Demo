package com.bill.dagger2.sample3;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Client_MembersInjector implements MembersInjector<Client> {
  private final Provider<Service> serviceProvider;

  public Client_MembersInjector(Provider<Service> serviceProvider) {
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  public static MembersInjector<Client> create(Provider<Service> serviceProvider) {
    return new Client_MembersInjector(serviceProvider);
  }

  @Override
  public void injectMembers(Client instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.setService(serviceProvider.get());
  }
}
