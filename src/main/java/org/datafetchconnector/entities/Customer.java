package org.datafetchconnector.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.intuit.ipp.data.*;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;

    public CompositeKey getCompositeKey() {
        return compositeKey;
    }

    public void setCompositeKey(CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }

    @EmbeddedId
    private CompositeKey compositeKey;

    @MapsId(value = "user_id")
    @ManyToOne
    private User user;

    private String syncToken;

    private String displayName;

    private String givenName;

    private String title;

    private String middleName;

    private String suffix;

    private String familyName;

    private String companyName;

    @Type(type = "json")
    @Column(name = "primaryEmailAddr", columnDefinition = "json")
    private Object primaryEmailAddr;


    private String resaleNum;

    private String secondaryTaxIdentifier;

    @Type(type = "json")
    @Column(name = "araccountRef", columnDefinition = "json")
    private Object araccountRef;

    @Type(type = "json")
    @Column(name = "defaultTaxCodeRef", columnDefinition = "json")
    private Object defaultTaxCodeRef;

    private String preferredDeliveryMethod;

    private String gstin;

    @Type(type = "json")
    @Column(name = "salesTermRef", columnDefinition = "json")
    private Object salesTermRef;

    @Type(type = "json")
    @Column(name = "customerTypeRef", columnDefinition = "json")
    private Object customerTypeRef;

    @Type(type = "json")
    @Column(name = "fax", columnDefinition = "json")
    private Object fax;


    private String businessNumber;

    private Boolean billWithParent;

    @Type(type = "json")
    @Column(name = "currencyRef", length = 16, columnDefinition = "json")
    private Object currencyRef;

    @Type(type = "json")
    @Column(name = "mobile", columnDefinition = "json")
    private Object mobile;

    private Boolean job;

    private double balanceWithJobs;

    @Type(type = "json")
    @Column(name = "primaryPhone", columnDefinition = "json")
    private Object primaryPhone;

    @Type(type = "json")
    @Column(name = "openBalanceDate", columnDefinition = "json")
    private Object openBalanceDate;

    private Boolean taxable;

    @Type(type = "json")
    @Column(name = "alternatePhone", columnDefinition = "json")
    private Object alternatePhone;

    @Type(type = "json")
    @Column(name = "metaData", columnDefinition = "json")
    private Object metaData;

    private String customerCommunicationAddr;


    @Type(type = "json")
    @Column(name = "parentRef", columnDefinition = "json")
    private Object parentRef;

    private String notes;

    @Type(type = "json")
    @Column(name = "webAddr", columnDefinition = "json")
    private Object webAddr;

    private Boolean active;

    private double balance;

    @Type(type = "json")
    @Column(name = "shipAddr", columnDefinition = "json")
    private Object shipAddr;

    @Type(type = "json")
    @Column(name = "paymentMethodRef", columnDefinition = "json")
    private Object paymentMethodRef;

    private Boolean isProject;

    private String primaryTaxIdentifier;

    private String gstRegistrationType;

    private String printOnCheckName;

    @Type(type = "json")
    @Column(name = "billAddr", columnDefinition = "json")
    private Object billAddr;

    private String fullyQualifiedName;

    private Integer level;

    private Integer taxExemptionReasonId;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Customer(org.json.JSONObject s) {
    }




}