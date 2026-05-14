package com.mycompany.proyect_yml.repository;


import com.mycompany.proyect_yml.domain.TipoDocumento;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;

@DataMongoTest
public class TipoDocumentoRepositoryTest {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Test
    void insert(){
        TipoDocumento tipoDocumento =new TipoDocumento(null,"CC","Cedula de ciudadania","Activo");
        tipoDocumentoRepository.insert(tipoDocumento);

    }
}
