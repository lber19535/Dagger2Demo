package com.bill.dagger2.sample5;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ServiceModule_ProvideIntFactory implements Factory<Integer> {
  private final ServiceModule module;

  public ServiceModule_ProvideIntFactory(ServiceModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Integer get() {
    return Preconditions.checkNotNull(
        module.provideInt(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Integer> create(ServiceModule module) {
    return new ServiceModule_ProvideIntFactory(module);
  }
}
