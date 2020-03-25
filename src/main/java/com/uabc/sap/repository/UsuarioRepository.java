package com.uabc.sap.repository;

import com.uabc.sap.model.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity,Long> {
}
