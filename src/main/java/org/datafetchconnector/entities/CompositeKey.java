package org.datafetchconnector.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompositeKey implements Serializable {

    protected Integer id;
    protected Integer user_id;


    public CompositeKey(Integer id, Integer user_id) {
        this.id = id;
        this.user_id = user_id;
    }

    public CompositeKey() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


}
