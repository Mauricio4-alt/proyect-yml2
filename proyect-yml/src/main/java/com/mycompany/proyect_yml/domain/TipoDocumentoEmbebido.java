package com.mycompany.proyect_yml.domain;

public class TipoDocumentoEmbebido {
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
