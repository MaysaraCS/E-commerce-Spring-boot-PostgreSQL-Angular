package com.ecommerceBackend.ecom.order.domain.order.vo;


import com.ecommerceBackend.ecom.shared.error.domain.Assert;

public record StripeSessionId(String value) {

  public StripeSessionId {
    Assert.notNull("value", value);
  }
}
