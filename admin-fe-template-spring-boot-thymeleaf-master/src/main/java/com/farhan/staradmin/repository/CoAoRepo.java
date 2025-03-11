package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.CoAo;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

@Repository
public interface CoAoRepo extends JpaAttributeConverter<CoAo, Integer> {
}
