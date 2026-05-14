package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.mongodb.test.autoconfigure.DataMongoTest;

@DataMongoTest
public class ClienteRepositoryTest  {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void insert(){
        Cliente cliente = new Cliente(null,"123456789","John","Doe","Smith","Johnsom");
        Cliente savedCliente = clienteRepository.insert(cliente);


    }
}
