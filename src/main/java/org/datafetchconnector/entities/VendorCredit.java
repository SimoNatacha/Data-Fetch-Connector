package org.datafetchconnector.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
@Entity
@Table(name = "vendorCredit")
public class VendorCredit {

    @EmbeddedId
    private CompositeKey compositeKey;

    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;

    @MapsId("user_id")
    @ManyToOne()
    private User user;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object vendorRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object line;

    private String syncToken;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object currencyRef;


    private String docNumber;


    private String privateNote;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object linkedTxn;

    private String globalTaxCalculation;


    private String exchangeRate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object departmentRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object apAccountRef;


    private Date txnDate;


    private String transactionLocationType;


    private boolean includeInAnnualTPAR;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;


    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object recurDataRef;


    private double totalAmt;


    private double balance;

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

    public Object getVendorRef() {
        return vendorRef;
    }

    public void setVendorRef(Object vendorRef) {
        this.vendorRef = vendorRef;
    }

    public Object getLine() {
        return line;
    }

    public void setLine(Object line) {
        this.line = line;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public Object getCurrencyRef() {
        return currencyRef;
    }

    public void setCurrencyRef(Object currencyRef) {
        this.currencyRef = currencyRef;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getPrivateNote() {
        return privateNote;
    }

    public void setPrivateNote(String privateNote) {
        this.privateNote = privateNote;
    }

    public Object getLinkedTxn() {
        return linkedTxn;
    }

    public void setLinkedTxn(Object linkedTxn) {
        this.linkedTxn = linkedTxn;
    }

    public String getGlobalTaxCalculation() {
        return globalTaxCalculation;
    }

    public void setGlobalTaxCalculation(String globalTaxCalculation) {
        this.globalTaxCalculation = globalTaxCalculation;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Object getDepartmentRef() {
        return departmentRef;
    }

    public void setDepartmentRef(Object departmentRef) {
        this.departmentRef = departmentRef;
    }

    public Object getApAccountRef() {
        return apAccountRef;
    }

    public void setApAccountRef(Object apAccountRef) {
        this.apAccountRef = apAccountRef;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public String getTransactionLocationType() {
        return transactionLocationType;
    }

    public void setTransactionLocationType(String transactionLocationType) {
        this.transactionLocationType = transactionLocationType;
    }

    public boolean isIncludeInAnnualTPAR() {
        return includeInAnnualTPAR;
    }

    public void setIncludeInAnnualTPAR(boolean includeInAnnualTPAR) {
        this.includeInAnnualTPAR = includeInAnnualTPAR;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }

    public Object getRecurDataRef() {
        return recurDataRef;
    }

    public void setRecurDataRef(Object recurDataRef) {
        this.recurDataRef = recurDataRef;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
