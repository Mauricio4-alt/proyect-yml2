package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClienteRepository extends MongoRepository<Cliente,String> {
}
