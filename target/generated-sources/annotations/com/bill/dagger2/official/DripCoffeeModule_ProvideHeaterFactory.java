package com.bill.dagger2.official;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public enum DripCoffeeModule_ProvideHeaterFactory implements Factory<Heater> {
  INSTANCE;

  @Override
  public Heater get() {
    return Preconditions.checkNotNull(
        DripCoffeeModule.provideHeater(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Heater> create() {
    return INSTANCE;
  }
}
