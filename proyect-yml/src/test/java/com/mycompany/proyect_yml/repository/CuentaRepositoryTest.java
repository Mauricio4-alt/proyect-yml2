package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Cliente;
import com.mycompany.proyect_yml.domain.Cuenta;
import com.mycompany.proyect_yml.domain.TipoDocumento;
import com.mycompany.proyect_yml.domain.enumarations.Estado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class CuentaRepositoryTest {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Autowired
    private ClienteRepository clienteRepository;


    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void insert(){
        mongoTemplate.dropCollection(Cliente.class);
        tipoDocumentoRepository.deleteAll();
        TipoDocumento tipoDocumentoCedula = tipoDocumentoRepository.insert(new TipoDocumento(null,"CC","Cedula de ciudadania", Estado.Activo));

        Cliente cliente = new Cliente (null,"123456789","John","Doe","Smith","Robinson");
        Cliente cliente2 = new Cliente (null,"99999","John","Doe","Smith","Robinson");



        cliente.setTipoDocumento(tipoDocumentoCedula);
        cliente2.setTipoDocumento(tipoDocumentoCedula);

        Cliente clienteGuardado= clienteRepository.insert(cliente);
        Cliente clienteGuardado2= clienteRepository.insert(cliente2);

        Cuenta cuenta01 = new Cuenta(null,"Cuenta de facebook", Estado.Activo);
        Cuenta cuenta02 = new Cuenta(null,"Cuenta de x", Estado.Activo);

        cuenta01.setCliente(clienteGuardado);
        cuenta02.setCliente(clienteGuardado2);


        cuentaRepository.insert(cuenta01);
        cuentaRepository.insert(cuenta02);
}}