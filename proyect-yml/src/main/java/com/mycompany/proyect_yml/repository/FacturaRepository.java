package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Factura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FacturaRepository extends MongoRepository<Factura,String> {

}
