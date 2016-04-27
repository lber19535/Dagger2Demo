package com.bill.dagger2.sample2;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideSimpleServiceFactory implements Factory<Service> {
  private final ServiceModule module;

  private final Provider<SimpleService> serviceProvider;

  public ServiceModule_ProvideSimpleServiceFactory(
      ServiceModule module, Provider<SimpleService> serviceProvider) {
    assert module != null;
    this.module = module;
    assert serviceProvider != null;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public Service get() {
    return Preconditions.checkNotNull(
        module.provideSimpleService(serviceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Service> create(
      ServiceModule module, Provider<SimpleService> serviceProvider) {
    return new ServiceModule_ProvideSimpleServiceFactory(module, serviceProvider);
  }
}
