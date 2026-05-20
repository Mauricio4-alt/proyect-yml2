package com.mycompany.proyect_yml.repository;


import com.mycompany.proyect_yml.domain.TipoDocumento;
import com.mycompany.proyect_yml.domain.TipoDocumentoEmbebido;
import com.mycompany.proyect_yml.domain.enumarations.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@DataMongoTest
public class TipoDocumentoRepositoryTest {


    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void insert(){
        mongoTemplate.dropCollection(TipoDocumentoEmbebido.class);
        TipoDocumento tipoDocumento =new TipoDocumento(null,"CC","Cedula de ciudadania", Estado.Activo);
        tipoDocumentoRepository.insert(tipoDocumento);

    }
}
