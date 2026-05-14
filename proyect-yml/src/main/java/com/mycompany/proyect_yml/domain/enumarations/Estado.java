package com.mycompany.proyect_yml.domain.enumarations;

public enum Estado {
    Activo("Activo"),
    Inactivo("Inactivo");

    private final String estado;

    public String getEstado() {
        return estado;
    }
}
