package org.datafetchconnector.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Table(name = "account")
@TypeDef(name = "json", typeClass = JsonStringType.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "syncToken")
    private String syncToken;

    @Column(name = "acctNum")
    private String acctNum;

    @Type(type = "json")
    @Column(name = "currencyRef", columnDefinition = "json")
    private Object currencyRef;

    @Type(type = "json")
    @Column(name = "parentRef", columnDefinition = "json")
    private Object parentRef;

    @Column(name = "description")
    private String description;

    @Column(name = "active")
    private boolean active;

    @Type(type = "json")
    @Column(name = "metaData", columnDefinition = "json")
    private Object metaData;

    @Column(name = "subAccount")
    private boolean subAccount;

    @Column(name = "classification")
    private String classification;

    @Column(name = "fullyQualifiedName")
    private String fullyQualifiedName;

    @Column(name = "txnLocationType")
    private String txnLocationType;


    @Column(name = "accountType")
    private String accountType;

    @Column(name = "currentBalanceWithSubAccounts")
    private double currentBalanceWithSubAccounts;

    @Column(name = "accountAlias")
    private String accountAlias;

    @Type(type = "json")
    @Column(name = "taxCodeRef", columnDefinition = "json")
    private Object taxCodeRef;


    @Column(name = "accountSubType")
    private String accountSubType;

    @Column(name = "currentBalance")
    private double currentBalance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public Object getCurrencyRef() {
        return currencyRef;
    }

    public void setCurrencyRef(Object currencyRef) {
        this.currencyRef = currencyRef;
    }

    public Object getParentRef() {
        return parentRef;
    }

    public void setParentRef(Object parentRef) {
        this.parentRef = parentRef;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }

    public boolean isSubAccount() {
        return subAccount;
    }

    public void setSubAccount(boolean subAccount) {
        this.subAccount = subAccount;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public String getTxnLocationType() {
        return txnLocationType;
    }

    public void setTxnLocationType(String txnLocationType) {
        this.txnLocationType = txnLocationType;
    }



    public double getCurrentBalanceWithSubAccounts() {
        return currentBalanceWithSubAccounts;
    }

    public void setCurrentBalanceWithSubAccounts(double currentBalanceWithSubAccounts) {
        this.currentBalanceWithSubAccounts = currentBalanceWithSubAccounts;
    }

    public String getAccountAlias() {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }

    public Object getTaxCodeRef() {
        return taxCodeRef;
    }

    public void setTaxCodeRef(Object taxCodeRef) {
        this.taxCodeRef = taxCodeRef;
    }



    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }
}