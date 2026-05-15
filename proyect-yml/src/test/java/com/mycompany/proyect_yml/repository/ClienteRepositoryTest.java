package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Cliente;
import com.mycompany.proyect_yml.domain.TipoDocumento;
import com.mycompany.proyect_yml.domain.TipoDocumentoEmbebido;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataMongoTest
public class ClienteRepositoryTest  {

    @Autowired
    private ClienteRepository clienteRepository;


    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;


    @Test
    void insert(){
        Cliente cliente = new Cliente (null,"123456789","John","Doe","Smith","Robinson");
        Cliente cliente2 = new Cliente (null,"123456789","John","Doe","Smith","Robinson");
        TipoDocumento tipoDocumentoCedula = tipoDocumentoRepository.findTipoDocumentoBySigla("CC").orElse(null);

        TipoDocumento tipoDocumentoNew = new TipoDocumento(null,tipoDocumentoCedula.getSigla(),tipoDocumentoCedula.getNombreDocumento(),tipoDocumentoCedula.getEstado());

        assertNotNull (tipoDocumentoCedula);
        cliente.setTipoDocumento(tipoDocumentoNew);
        cliente2.setTipoDocumento(tipoDocumentoNew);

        clienteRepository.insert(cliente);
        clienteRepository.insert(cliente2); 


    }
}
