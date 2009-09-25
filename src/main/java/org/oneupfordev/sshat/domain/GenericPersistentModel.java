package org.oneupfordev.sshat.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class GenericPersistentModel<T> implements Serializable {

    @Id
    private T id;

    public T getId() {
        return this.id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        return false;
    }
}
