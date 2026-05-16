package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Cliente;
import com.mycompany.proyect_yml.domain.TipoDocumento;
import com.mycompany.proyect_yml.domain.TipoDocumentoEmbebido;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
public class ClienteRepositoryTest  {

    @Autowired
    private ClienteRepository clienteRepository;


    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void insert(){
        //mongoTemplate.dropCollection(Cliente.class);
        //tipoDocumentoRepository.deleteAll();
        TipoDocumento tipoDocumentoCedula = tipoDocumentoRepository.findTipoDocumentoBySigla("CC").orElse(null);

        Cliente cliente = new Cliente (null,"123456789","John","Doe","Smith","Robinson");
        Cliente cliente2 = new Cliente (null,"99999","John","Doe","Smith","Robinson");



        cliente.setTipoDocumento(tipoDocumentoCedula);
        cliente2.setTipoDocumento(tipoDocumentoCedula);

        Cliente clienteGuardado= clienteRepository.insert(cliente);
        Cliente clienteGuardado2= clienteRepository.insert(cliente2);

        assertNotNull(clienteGuardado.getId());
        assertNotNull(clienteGuardado2.getId());
        assertNotNull(clienteGuardado.getTipoDocumento());
        assertNotNull(clienteGuardado2.getTipoDocumento());
        assertEquals("CC",clienteGuardado2.getTipoDocumento().getSigla());
        assertEquals("CC",clienteGuardado2.getTipoDocumento().getSigla());
        assertEquals(2,clienteRepository.count());











    }
}
