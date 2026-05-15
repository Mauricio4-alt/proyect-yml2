package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.TipoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TipoDocumentoRepository extends MongoRepository<TipoDocumento,String> {
    // method Query
    Optional<TipoDocumento> findTipoDocumentoBySigla(String sigla);
}
