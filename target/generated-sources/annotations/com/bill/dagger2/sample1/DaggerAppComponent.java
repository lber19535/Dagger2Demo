package com.bill.dagger2.sample1;

import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Client> clientProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.clientProvider =
        ScopedProvider.create(Client_Factory.create(SimpleService_Factory.create()));
  }

  @Override
  public Client makeClient() {
    return clientProvider.get();
  }

  public static final class Builder {
    private Builder() {}

    public AppComponent build() {
      return new DaggerAppComponent(this);
    }
  }
}
