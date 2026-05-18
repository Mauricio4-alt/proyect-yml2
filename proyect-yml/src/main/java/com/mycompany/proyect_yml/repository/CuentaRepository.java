package com.mycompany.proyect_yml.repository;

import com.mycompany.proyect_yml.domain.Cuenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CuentaRepository  extends MongoRepository<Cuenta,String> {


}
