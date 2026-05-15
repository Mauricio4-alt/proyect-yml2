package com.mycompany.proyect_yml.domain.enumarations;

public enum Estado {
    Activo("Activo"),
    Inactivo("Inactivo");

    private final String estado;

    Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
