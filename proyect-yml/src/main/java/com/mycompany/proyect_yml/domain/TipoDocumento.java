package com.mycompany.proyect_yml.domain;

import com.mongodb.lang.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;


@Document(collection= "tipo_documento")
public class TipoDocumento implements Serializable {

    @Serial
    private static long serialVersionUID=1L;

    @Id
    private String id;

    @NonNull
    @Indexed(unique = true,name="idx_unique_sigla")
    @Field("Sigla")
    private String sigla;

    @NonNull
    @Field("nombre_documento")
    @Indexed(unique = true,name="idx_unique_nombre_documento")
    private String nombreDocumento;

    @NonNull
    @Field("estado")
    private String estado;

    public TipoDocumento(String id, @NonNull String sigla, @NonNull String nombreDocumento, @NonNull String estado) {
        this.id = id;
        this.sigla = sigla;
        this.nombreDocumento = nombreDocumento;
        this.estado = estado;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        TipoDocumento.serialVersionUID = serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    public String getSigla() {
        return sigla;
    }

    public void setSigla(@NonNull String sigla) {
        this.sigla = sigla;
    }

    @NonNull
    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(@NonNull String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    @NonNull
    public String getEstado() {
        return estado;
    }

    public void setEstado(@NonNull String estado) {
        this.estado = estado;
    }
}
