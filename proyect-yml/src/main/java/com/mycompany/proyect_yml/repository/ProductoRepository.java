package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Producto;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto,String> {

}
