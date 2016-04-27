package com.bill.dagger2.sample5;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideSubClientFactory implements Factory<SubClient> {
  private final ServiceModule module;

  private final Provider<SubClient> subClientProvider;

  public ServiceModule_ProvideSubClientFactory(
      ServiceModule module, Provider<SubClient> subClientProvider) {
    assert module != null;
    this.module = module;
    assert subClientProvider != null;
    this.subClientProvider = subClientProvider;
  }

  @Override
  public SubClient get() {
    return Preconditions.checkNotNull(
        module.provideSubClient(subClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SubClient> create(
      ServiceModule module, Provider<SubClient> subClientProvider) {
    return new ServiceModule_ProvideSubClientFactory(module, subClientProvider);
  }
}
