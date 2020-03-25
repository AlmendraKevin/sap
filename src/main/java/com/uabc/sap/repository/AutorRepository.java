package com.uabc.sap.repository;

import com.uabc.sap.model.AutorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<AutorEntity,Long> {
}
