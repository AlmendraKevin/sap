package com.uabc.sap.repository;

import com.uabc.sap.model.ProductoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoEntity,Long> {

}
