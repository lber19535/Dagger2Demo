package com.bill.dagger2.sample5;

import com.bill.dagger2.sample3.Service;
import com.bill.dagger2.sample3.SimpleService_Factory;
import dagger.internal.Preconditions;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerNewAppComponent implements NewAppComponent {
  private Provider<Service> provideSimpleServiceProvider;

  private Provider<Client> clientProvider;

  private Provider<Integer> provideIntProvider;

  private Provider<SubClient> subClientProvider;

  private DaggerNewAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideSimpleServiceProvider =
        ScopedProvider.create(
            ServiceModule_ProvideSimpleServiceFactory.create(
                builder.serviceModule, SimpleService_Factory.create()));

    this.clientProvider = Client_Factory.create(provideSimpleServiceProvider);

    this.provideIntProvider =
        ScopedProvider.create(ServiceModule_ProvideIntFactory.create(builder.serviceModule));

    this.subClientProvider = SubClient_Factory.create(provideIntProvider);
  }

  @Override
  public Client makeClient() {
    return clientProvider.get();
  }

  @Override
  public SubClient makeSubClient() {
    return subClientProvider.get();
  }

  public static final class Builder {
    private ServiceModule serviceModule;

    private SubAppComponent subAppComponent;

    private Builder() {}

    public NewAppComponent build() {
      if (serviceModule == null) {
        this.serviceModule = new ServiceModule();
      }
      if (subAppComponent == null) {
        throw new IllegalStateException(SubAppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerNewAppComponent(this);
    }

    public Builder serviceModule(ServiceModule serviceModule) {
      this.serviceModule = Preconditions.checkNotNull(serviceModule);
      return this;
    }

    public Builder subAppComponent(SubAppComponent subAppComponent) {
      this.subAppComponent = Preconditions.checkNotNull(subAppComponent);
      return this;
    }
  }
}
