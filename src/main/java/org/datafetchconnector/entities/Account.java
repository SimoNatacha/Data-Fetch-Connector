package org.datafetchconnector.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "account")
public class Account extends  BaseEntity {
    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;

    @EmbeddedId
    private CompositeKey compositeKey;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CompositeKey getCompositeKey() {
        return compositeKey;
    }

    public void setCompositeKey(CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }

    @MapsId("user_id")
    @ManyToOne()
    private User user;

    private String name;
    private String syncToken;
    private String acctNum;

    private String description;
    private Boolean active;

    private Boolean subAccount;
    private String classification;
    private String fullyQualifiedName;
    private String txnLocationType;
    private String accountType;
    private Float currentBalanceWithSubAccounts;
    private String accountAlias;
    private String accountSubType;
    private Float currentBalance;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object currencyRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object parentRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object taxCodeRef;



}