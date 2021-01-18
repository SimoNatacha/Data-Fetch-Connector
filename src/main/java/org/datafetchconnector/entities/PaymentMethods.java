package org.datafetchconnector.entities;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "paymentmethod")
public class PaymentMethods extends BaseEntity {

    @EmbeddedId
   private CompositeKey compositeKey;
//
   @Column(name = "id", insertable = false, updatable = false)
   private Integer id;
//
   @MapsId("user_id")
   @ManyToOne()
   private User user;

    private String name;
    private String syncToken;
    private Boolean active;
    private String type;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaDate;

    public CompositeKey getCompositeKey() {
        return compositeKey;
    }

    public void setCompositeKey(CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getMetaDate() {
        return metaDate;
    }

    public void setMetaDate(Object metaDate) {
        this.metaDate = metaDate;
    }
}













//
