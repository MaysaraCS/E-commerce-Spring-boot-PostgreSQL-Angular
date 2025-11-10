package com.ecommerceBackend.ecom.order.domain.order.aggregate;


import com.ecommerceBackend.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

@Builder
public record DetailCartItemRequest(PublicId productId, long quantity) {
}
