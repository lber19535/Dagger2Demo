package com.bill.dagger2.sample3;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Client_Factory implements Factory<Client> {
  private final MembersInjector<Client> clientMembersInjector;

  public Client_Factory(MembersInjector<Client> clientMembersInjector) {
    assert clientMembersInjector != null;
    this.clientMembersInjector = clientMembersInjector;
  }

  @Override
  public Client get() {
    return MembersInjectors.injectMembers(clientMembersInjector, new Client());
  }

  public static Factory<Client> create(MembersInjector<Client> clientMembersInjector) {
    return new Client_Factory(clientMembersInjector);
  }
}
