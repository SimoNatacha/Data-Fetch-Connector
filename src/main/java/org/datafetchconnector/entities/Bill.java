package org.datafetchconnector.entities;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @Column(name = "id")
    private Integer id;

    @Type(type = "json")
    @Column(name = "vendorRef",columnDefinition = "json")
    private Object vendorRef;

    @Type(type = "json")
    @Column(name = "line",columnDefinition = "json")
    private Object line;

    @Column(name = "syncToken")
    private String syncToken;


    @Type(type = "json")
    @Column(name = "currencyRef", columnDefinition = "json")
    private Object currencyRef;

    @Column(name = "txnDate")
    private Date txnDate;

    @Type(type = "json")
    @Column(name = "apaccountRef", columnDefinition = "json")
    private Object apaccountRef;

    @Type(type = "json")
    @Column(name = "linkedTxn", columnDefinition = "json")
    private Object linkedTxn;
    ;
    @Type(type = "json")
    @Column(name = "salesTermRef", columnDefinition = "json")
    private Object salesTermRef;

    @Column(name = "globalTaxCalculation")
    private String globalTaxCalculation;

    @Column(name = "totalAmt")
    private double totalAmt;


    @Column(name = "transactionLocationType")
    private String transactionLocationType;

    @Type(type = "json")
    @Column(name = "dueDate", columnDefinition = "json")
    private Object dueDate;

    @Type(type = "json")
    @Column(name = "metaData", columnDefinition = "json")
    private Object metaData;

    @Column(name = "docNumber")
    private String docNumber;

    @Column(name = "privateNote")
    private String privateNote;

    @Type(type = "json")
    @Column(name = "txnTaxDetail", columnDefinition = "json")
    private Object txnTaxDetail;

    @Column(name = "exchangeRate")
    private double exchangeRate;

    @Type(type = "json")
    @Column(name = "departmentRef", columnDefinition = "json")
    private Object departmentRef;

    @Column(name = "includeInAnnualTPAR")
    private Boolean includeInAnnualTPAR;

    @Column(name = "homeBalance")
    private double homeBalance;

    @Type(type = "json")
    @Column(name = "recurDataRef", columnDefinition = "json")
    private Object recurDataRef;

    @Column(name = "balance")
    private double balance;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public Object getApaccountRef() {
        return apaccountRef;
    }

    public void setApaccountRef(Object apaccountRef) {
        this.apaccountRef = apaccountRef;
    }

    public Object getLinkedTxn() {
        return linkedTxn;
    }

    public void setLinkedTxn(Object linkedTxn) {
        this.linkedTxn = linkedTxn;
    }

    public Object getSalesTermRef() {
        return salesTermRef;
    }

    public void setSalesTermRef(Object salesTermRef) {
        this.salesTermRef = salesTermRef;
    }

    public String getGlobalTaxCalculation() {
        return globalTaxCalculation;
    }

    public void setGlobalTaxCalculation(String globalTaxCalculation) {
        this.globalTaxCalculation = globalTaxCalculation;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getTransactionLocationType() {
        return transactionLocationType;
    }

    public void setTransactionLocationType(String transactionLocationType) {
        this.transactionLocationType = transactionLocationType;
    }

    public Object getDueDate() {
        return dueDate;
    }

    public void setDueDate(Object dueDate) {
        this.dueDate = dueDate;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
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

    public Object getTxnTaxDetail() {
        return txnTaxDetail;
    }

    public void setTxnTaxDetail(Object txnTaxDetail) {
        this.txnTaxDetail = txnTaxDetail;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Object getDepartmentRef() {
        return departmentRef;
    }

    public void setDepartmentRef(Object departmentRef) {
        this.departmentRef = departmentRef;
    }

    public Boolean getIncludeInAnnualTPAR() {
        return includeInAnnualTPAR;
    }

    public void setIncludeInAnnualTPAR(Boolean includeInAnnualTPAR) {
        this.includeInAnnualTPAR = includeInAnnualTPAR;
    }

    public double getHomeBalance() {
        return homeBalance;
    }

    public void setHomeBalance(double homeBalance) {
        this.homeBalance = homeBalance;
    }

    public Object getRecurDataRef() {
        return recurDataRef;
    }

    public void setRecurDataRef(Object recurDataRef) {
        this.recurDataRef = recurDataRef;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}