package com.bill.dagger2.official;

import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerCoffeeApp_Coffee implements CoffeeApp.Coffee {
  private Provider<Thermosiphon> thermosiphonProvider;

  private Provider<Pump> providePumpProvider;

  private Provider<CoffeeMaker> coffeeMakerProvider;

  private DaggerCoffeeApp_Coffee(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static CoffeeApp.Coffee create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.thermosiphonProvider =
        Thermosiphon_Factory.create(DripCoffeeModule_ProvideHeaterFactory.create());

    this.providePumpProvider =
        ScopedProvider.create(
            PumpModule_ProvidePumpFactory.create(builder.pumpModule, thermosiphonProvider));

    this.coffeeMakerProvider =
        CoffeeMaker_Factory.create(
            DripCoffeeModule_ProvideHeaterFactory.create(), providePumpProvider);
  }

  @Override
  public CoffeeMaker maker() {
    return coffeeMakerProvider.get();
  }

  public static final class Builder {
    private PumpModule pumpModule;

    private Builder() {}

    public CoffeeApp.Coffee build() {
      if (pumpModule == null) {
        this.pumpModule = new PumpModule();
      }
      return new DaggerCoffeeApp_Coffee(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder dripCoffeeModule(DripCoffeeModule dripCoffeeModule) {
      Preconditions.checkNotNull(dripCoffeeModule);
      return this;
    }

    public Builder pumpModule(PumpModule pumpModule) {
      this.pumpModule = Preconditions.checkNotNull(pumpModule);
      return this;
    }
  }
}
