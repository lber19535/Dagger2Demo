package com.bill.dagger2.sample4;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<Client> clientProvider;

  public App_MembersInjector(Provider<Client> clientProvider) {
    assert clientProvider != null;
    this.clientProvider = clientProvider;
  }

  public static MembersInjector<App> create(Provider<Client> clientProvider) {
    return new App_MembersInjector(clientProvider);
  }

  @Override
  public void injectMembers(App instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.client = clientProvider.get();
  }

  public static void injectClient(App instance, Provider<Client> clientProvider) {
    instance.client = clientProvider.get();
  }
}
