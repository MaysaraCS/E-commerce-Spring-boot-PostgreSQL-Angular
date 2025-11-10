package com.ecommerceBackend.ecom.product.domain.vo;


import com.ecommerceBackend.ecom.shared.error.domain.Assert;

public record ProductBrand(String value) {

  public ProductBrand {
    Assert.field("value", value).notNull().minLength(3);
  }
}
