package com.bill.dagger2.sample3;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideSimpleServiceFactory implements Factory<Service> {
  private final Provider<SimpleService> serviceProvider;

  public ServiceModule_ProvideSimpleServiceFactory(Provider<SimpleService> serviceProvider) {
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Service get() {
    return Preconditions.checkNotNull(
        ServiceModule.provideSimpleService(serviceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Service> create(Provider<SimpleService> serviceProvider) {
    return new ServiceModule_ProvideSimpleServiceFactory(serviceProvider);
  }
}
