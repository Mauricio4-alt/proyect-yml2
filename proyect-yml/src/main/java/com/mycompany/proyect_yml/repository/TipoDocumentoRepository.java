package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.TipoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipoDocumentoRepository extends MongoRepository<TipoDocumento,String> {
}
