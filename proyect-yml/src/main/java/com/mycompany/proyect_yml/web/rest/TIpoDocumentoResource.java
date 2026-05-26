package com.mycompany.proyect_yml.web.rest;


import com.mycompany.proyect_yml.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TIpoDocumentoResource {

    @Autowired
    TipoDocumentoRepository tipoDocumentoRepository;

    public TIpoDocumentoResource(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }

}
