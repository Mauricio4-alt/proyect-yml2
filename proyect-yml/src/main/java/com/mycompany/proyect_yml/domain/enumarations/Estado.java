package com.mycompany.proyect_yml.domain.enumarations;

public enum Estado {
    Activo("ACTIVO"),
    Inactivo("INACTIVO");

    private final String estado;

    Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
