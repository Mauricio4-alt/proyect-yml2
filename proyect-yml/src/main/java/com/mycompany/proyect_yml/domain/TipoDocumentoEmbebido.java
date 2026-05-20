package com.mycompany.proyect_yml.domain;


import java.io.Serial;
import java.io.Serializable;

public class TipoDocumentoEmbebido implements Serializable {
    @Serial
    private static long serialVersionUID;


    private String sigla;
    private String nombreDocumento;

    public TipoDocumentoEmbebido(String sigla, String nombreDocumento) {
        this.sigla = sigla;
        this.nombreDocumento = nombreDocumento;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }
}
