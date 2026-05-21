package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;

import static org.junit.jupiter.api.Assertions.*;


@DataMongoTest
class productoRepositoryTest {
    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

}