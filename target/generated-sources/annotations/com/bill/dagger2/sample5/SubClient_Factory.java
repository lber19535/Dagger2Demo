package com.bill.dagger2.sample5;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SubClient_Factory implements Factory<SubClient> {
  private final Provider<Integer> iProvider;

  public SubClient_Factory(Provider<Integer> iProvider) {
    assert iProvider != null;
    this.iProvider = iProvider;
  }

  @Override
  public SubClient get() {
    return new SubClient(iProvider.get());
  }

  public static Factory<SubClient> create(Provider<Integer> iProvider) {
    return new SubClient_Factory(iProvider);
  }
}
