package com.ecommerceBackend.ecom.order.domain.user.vo;


import com.ecommerceBackend.ecom.shared.error.domain.Assert;

public record UserLastname(String value) {

  public UserLastname {
    Assert.field("value", value).maxLength(255);
  }
}
