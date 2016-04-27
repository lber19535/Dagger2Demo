package com.bill.dagger2.sample5;

import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerSubAppComponent implements SubAppComponent {
  private DaggerSubAppComponent(Builder builder) {
    assert builder != null;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SubAppComponent create() {
    return builder().build();
  }

  public static final class Builder {
    private Builder() {}

    public SubAppComponent build() {
      return new DaggerSubAppComponent(this);
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
