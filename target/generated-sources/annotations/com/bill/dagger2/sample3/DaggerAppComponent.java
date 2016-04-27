package com.bill.dagger2.sample3;

import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<Service> provideSimpleServiceProvider;

  private MembersInjector<Client> clientMembersInjector;

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

    this.provideSimpleServiceProvider =
        ServiceModule_ProvideSimpleServiceFactory.create(SimpleService_Factory.create());

    this.clientMembersInjector = Client_MembersInjector.create(provideSimpleServiceProvider);

    this.clientProvider = Client_Factory.create(clientMembersInjector);
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

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder serviceModule(ServiceModule serviceModule) {
      Preconditions.checkNotNull(serviceModule);
      return this;
    }
  }
}
