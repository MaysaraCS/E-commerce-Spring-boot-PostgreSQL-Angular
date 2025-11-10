package com.ecommerceBackend.ecom.order.domain.user.vo;

import com.ecommerceBackend.ecom.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}
