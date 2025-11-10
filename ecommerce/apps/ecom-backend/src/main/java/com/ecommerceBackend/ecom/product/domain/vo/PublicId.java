package com.ecommerceBackend.ecom.product.domain.vo;


import com.ecommerceBackend.ecom.shared.error.domain.Assert;

import java.util.UUID;

public record PublicId(UUID value) {

  public PublicId {
    Assert.notNull("value", value);
  }
}
