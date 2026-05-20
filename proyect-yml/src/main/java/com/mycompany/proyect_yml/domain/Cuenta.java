package com.mycompany.proyect_yml.domain;

import com.mongodb.lang.NonNull;
import com.mycompany.proyect_yml.domain.enumarations.Estado;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serial;
import java.io.Serializable;



public class Cuenta implements Serializable {
    @Serial
    private static long serialVersionUID;

    @Id
    private String id;

    @NonNull
    @Size(max=50)
    private String nickname;


    @NonNull
    private Estado estado;

    @DocumentReference
    @Field("clientes")
    private Cliente cliente;

    public Cuenta(String id, @NonNull String nickname, @NonNull Estado estado) {
        this.id = id;
        this.nickname = nickname;
        this.estado = estado;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        Cuenta.serialVersionUID = serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    public String getNickname() {
        return nickname;
    }

    public void setNickname(@NonNull String nickname) {
        this.nickname = nickname;
    }

    @NonNull
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(@NonNull Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
