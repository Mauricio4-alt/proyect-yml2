package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Cliente;
import com.mycompany.proyect_yml.domain.Factura;
import com.mycompany.proyect_yml.domain.TipoDocumento;
import com.mycompany.proyect_yml.domain.enumarations.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.expression.spel.CodeFlow;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
class FacturaRepositoryTest {
    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void insert(){
        tipoDocumentoRepository.deleteAll();
        clienteRepository.deleteAll();
        facturaRepository.deleteAll();

        TipoDocumento tipoDocumentoCedula = tipoDocumentoRepository.insert(new TipoDocumento(null,"CC","Cedula de ciudadania", Estado.Activo));

        Cliente cliente = new Cliente (null,"123456789","John","Doe","Smith","Robinson");
        Cliente cliente2 = new Cliente (null,"99999","John","Doe","Smith","Robinson");



        cliente.setTipoDocumento(tipoDocumentoCedula);
        cliente2.setTipoDocumento(tipoDocumentoCedula);


        Factura factura1 = new Factura(null,1l,2026, new Date(),23800.0,3800,20000);
        Factura factura2 = new Factura(null,2l,2026, new Date(),23800.0,3800,20000);
        Factura factura3 = new Factura(null,3l,2026, new Date(),23800.0,3800,20000);
        Factura factura4 = new Factura(null,4l,2026, new Date(),23800.0,3800,20000);

        Cliente clienteGuardado2 = clienteRepository.insert(cliente2);

        facturaRepository.insert(factura1);
        facturaRepository.insert(factura2);
        facturaRepository.insert(factura3);
        facturaRepository.insert(factura4);

        Cliente clienteGuardado = clienteRepository.insert(cliente);



        clienteRepository.save(clienteGuardado);


    }
}