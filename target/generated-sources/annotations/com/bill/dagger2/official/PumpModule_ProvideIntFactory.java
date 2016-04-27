package com.bill.dagger2.official;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PumpModule_ProvideIntFactory implements Factory<Integer> {
  private final PumpModule module;

  public PumpModule_ProvideIntFactory(PumpModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Integer get() {
    return Preconditions.checkNotNull(
        module.provideInt(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Integer> create(PumpModule module) {
    return new PumpModule_ProvideIntFactory(module);
  }
}
