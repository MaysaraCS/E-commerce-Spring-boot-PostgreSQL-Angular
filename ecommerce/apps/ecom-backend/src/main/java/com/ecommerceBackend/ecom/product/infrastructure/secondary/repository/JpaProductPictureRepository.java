package com.ecommerceBackend.ecom.product.infrastructure.secondary.repository;


import com.ecommerceBackend.ecom.product.infrastructure.secondary.entity.PictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductPictureRepository extends JpaRepository<PictureEntity, Long> {
}
