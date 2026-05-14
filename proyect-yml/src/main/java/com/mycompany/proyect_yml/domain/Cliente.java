package com.mycompany.proyect_yml.domain;

import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
@Document(collection = "clientes")
public class Cliente implements Serializable {

    @Id
    private String id;

    @NonNull
    @Size(max=50)
    @Field("numero_documento")
    private String numeroDocumento;

    @NonNull
    @Size(max = 50)
    @Field("primer_nombre")
    private String primerNombre;

    @NonNull
    @Size(max = 50)
    @Field("segundo_nombre")
    private String segundoNombre;

    @NonNull
    @Size(max = 50)
    @Field("primer_apellido")
    private String primerApellido;

    @NonNull
    @Size(max = 50)
    @Field("segundo_apellido")
    private String segundoApellido;

    public Cliente(String id, @NonNull String numeroDocumento, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        this.id = id;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
}
