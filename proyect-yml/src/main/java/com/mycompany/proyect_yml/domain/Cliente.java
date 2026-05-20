package com.mycompany.proyect_yml.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mongodb.lang.NonNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Document(collection = "clientes")
public class Cliente implements Serializable {

    @Serial
    private static long serialVersionUID;

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




    @DocumentReference
    @Field("tipo_documento")
    //@JsonIgnoreProperties(value={"clientes"},allowSetters = true)
    private TipoDocumento tipoDocumento;

    @DocumentReference
    @Field("cuenta")
    private Cuenta cuenta;

    @DBRef
    @Field("facturas")
    @JsonIgnoreProperties(value = {"clientes"},allowSetters = true)
    private Set<Object> facturaSet = new HashSet<>();


    public Cliente(String id, @NonNull String numeroDocumento, @NonNull String primerNombre, @NonNull String segundoNombre, @NonNull String primerApellido, @NonNull String segundoApellido) {
        this.id = id;
        this.numeroDocumento = numeroDocumento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(@NonNull String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @NonNull
    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(@NonNull String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @NonNull
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(@NonNull String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @NonNull
    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(@NonNull String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @NonNull
    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(@NonNull String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        Cliente.serialVersionUID = serialVersionUID;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Set<Object> getFacturaSet() {
        return facturaSet;
    }

    public void setFacturaSet(Set<Object> facturaSet) {
        this.facturaSet = facturaSet;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
