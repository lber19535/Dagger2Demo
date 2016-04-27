package com.bill.dagger2.sample2;

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
        ServiceModule_ProvideSimpleServiceFactory.create(
            builder.serviceModule, SimpleService_Factory.create());

    this.clientMembersInjector = Client_MembersInjector.create(provideSimpleServiceProvider);

    this.clientProvider = Client_Factory.create(clientMembersInjector);
  }

  @Override
  public Client makeClient() {
    return clientProvider.get();
  }

  public static final class Builder {
    private ServiceModule serviceModule;

    private Builder() {}

    public AppComponent build() {
      if (serviceModule == null) {
        this.serviceModule = new ServiceModule();
      }
      return new DaggerAppComponent(this);
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }
  }
}
