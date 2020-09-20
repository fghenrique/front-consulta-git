package br.com.fabricio.consumirgit.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import java.io.Serializable;
import java.util.Objects;


@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityBase implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private boolean persistido;
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityBase identity = (EntityBase) o;
        return Objects.equals(id, identity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isPersistido() {
        return persistido;
    }

    public void setPersistido(boolean persistido) {
        this.persistido = persistido;
    }
}