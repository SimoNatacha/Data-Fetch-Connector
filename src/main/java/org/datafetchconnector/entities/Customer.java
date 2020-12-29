package org.datafetchconnector.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.intuit.ipp.data.*;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Table(name = "customer")
@TypeDef(name = "json", typeClass = JsonStringType.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "syncToken")
    private String syncToken;

    @Column(name = "displayName")
    private String displayName;

    @Column(name = "givenName")
    private String givenName;

    @Column(name = "title")
    private String title;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "suffix")
    private String suffix;

    @Column(name = "familyName")
    private String familyName;

    @Column(name = "companyName")
    private String companyName;

    @Type(type = "json")
    @Column(name = "primaryEmailAddr",columnDefinition = "json")
    private Object primaryEmailAddr;


    @Column(name = "resaleNum")
    private String resaleNum;

    @Column(name = "secondaryTaxIdentifier")
    private String secondaryTaxIdentifier;

    @Type(type = "json")
    @Column(name = "araccountRef",columnDefinition = "json")
    private Object araccountRef;

    @Type(type = "json")
    @Column(name = "defaultTaxCodeRef",columnDefinition = "json")
    private Object defaultTaxCodeRef;

    @Column(name = "preferredDeliveryMethod")
    private String preferredDeliveryMethod;

    @Column(name = "gstin")
    private String gstin;

    @Type(type = "json")
    @Column(name = "salesTermRef",columnDefinition = "json")
    private Object salesTermRef;

    @Type(type = "json")
    @Column(name = "customerTypeRef",columnDefinition = "json")
    private Object customerTypeRef;

    @Type(type = "json")
    @Column(name = "fax",columnDefinition = "json")
    private Object fax;


    @Column(name = "businessNumber")
    private String businessNumber;

    @Column(name = "billWithParent")
    private Boolean billWithParent;

    @Type(type = "json")
    @Column(name = "currencyRef",length = 16,columnDefinition = "json")
    private Object currencyRef;

    @Type(type = "json")
    @Column(name = "mobile",columnDefinition = "json")
    private Object mobile;

    @Column(name = "job")
    private Boolean job;

    @Column(name = "balanceWithJobs")
    private double balanceWithJobs;

    @Type(type = "json")
    @Column(name = "primaryPhone",columnDefinition = "json")
    private Object primaryPhone;

    @Type(type = "json")
    @Column(name = "openBalanceDate",columnDefinition = "json")
    private Object openBalanceDate;

    @Column(name = "taxable")
    private Boolean taxable;

    @Type(type = "json")
    @Column(name = "alternatePhone",columnDefinition = "json")
    private Object alternatePhone;

    @Type(type = "json")
    @Column(name = "metaData",columnDefinition = "json")
    private Object metaData;

    @Column(name = "customerCommunicationAddr")
    private String customerCommunicationAddr;


    @Type(type = "json")
    @Column(name = "parentRef",columnDefinition = "json")
    private Object parentRef;

    @Column(name = "notes")
    private String notes;

    @Type(type = "json")
    @Column(name = "webAddr",columnDefinition = "json")
    private Object webAddr;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "balance")
    private double balance;

    @Type(type = "json")
    @Column(name = "shipAddr",columnDefinition = "json")
    private Object shipAddr;

    @Type(type = "json")
    @Column(name = "paymentMethodRef",columnDefinition = "json")
    private Object paymentMethodRef;

    @Column(name = "isProject")
    private Boolean isProject;

    @Column(name = "primaryTaxIdentifier")
    private String primaryTaxIdentifier;

    @Column(name = "gstRegistrationType")
    private String gstRegistrationType;

    @Column(name = "printOnCheckName")
    private String printOnCheckName;

    @Type(type = "json")
    @Column(name = "billAddr",columnDefinition = "json")
    private Object billAddr;

    @Column(name = "fullyQualifiedName")
    private String fullyQualifiedName;

    @Column(name = "level")
    private Integer level;

    @Column(name = "taxExemptionReasonId")
    private Integer taxExemptionReasonId;



    public Customer(org.json.JSONObject s) {
    }

    public Customer(Integer id) {
        this.id = id;
    }

   }