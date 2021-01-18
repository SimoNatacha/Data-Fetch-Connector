package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@XmlRootElement
@Entity
@Table(name = "creditMemo")
public class CreditMemo {

    @EmbeddedId
    private CompositeKey compositeKey;

    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;


    @MapsId("user_id")
    @ManyToOne()
    private User user;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billEmail;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object line;

    private String syncToken;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customerRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object currencyRef;


    private Date txnDate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customField;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object classRef;

    private String printStatus;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object salesTermRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object invoiceRef;



    private String globalTaxCalculation;

    private double totalAmt;


    private String transactionLocationType;


    private Boolean applyTaxAfterDiscount;


    private String docNumber;


    private String privateNote;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customerMemo;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object txnTaxDetail;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object paymentMethodRef;


    private double ExchangeRate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipAddr;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object departmentRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billAddr;


    private double homeBalance;


    private String emailStatus;

    private double remainingCredit;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object recurDataRef;


    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object taxExemptionRef;


    private double balance;

    private double homeTotalAmt;


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

    public Object getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(Object billEmail) {
        this.billEmail = billEmail;
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

    public Object getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(Object customerRef) {
        this.customerRef = customerRef;
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

    public Object getCustomField() {
        return customField;
    }

    public void setCustomField(Object customField) {
        this.customField = customField;
    }

    public Object getClassRef() {
        return classRef;
    }

    public void setClassRef(Object classRef) {
        this.classRef = classRef;
    }

    public String getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(String printStatus) {
        this.printStatus = printStatus;
    }

    public Object getSalesTermRef() {
        return salesTermRef;
    }

    public void setSalesTermRef(Object salesTermRef) {
        this.salesTermRef = salesTermRef;
    }

    public Object getInvoiceRef() {
        return invoiceRef;
    }

    public void setInvoiceRef(Object invoiceRef) {
        this.invoiceRef = invoiceRef;
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

    public Boolean getApplyTaxAfterDiscount() {
        return applyTaxAfterDiscount;
    }

    public void setApplyTaxAfterDiscount(Boolean applyTaxAfterDiscount) {
        this.applyTaxAfterDiscount = applyTaxAfterDiscount;
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

    public Object getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(Object customerMemo) {
        this.customerMemo = customerMemo;
    }

    public Object getTxnTaxDetail() {
        return txnTaxDetail;
    }

    public void setTxnTaxDetail(Object txnTaxDetail) {
        this.txnTaxDetail = txnTaxDetail;
    }

    public Object getPaymentMethodRef() {
        return paymentMethodRef;
    }

    public void setPaymentMethodRef(Object paymentMethodRef) {
        this.paymentMethodRef = paymentMethodRef;
    }

    public double getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        ExchangeRate = exchangeRate;
    }

    public Object getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(Object shipAddr) {
        this.shipAddr = shipAddr;
    }

    public Object getDepartmentRef() {
        return departmentRef;
    }

    public void setDepartmentRef(Object departmentRef) {
        this.departmentRef = departmentRef;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }

    public Object getBillAddr() {
        return billAddr;
    }

    public void setBillAddr(Object billAddr) {
        this.billAddr = billAddr;
    }

    public double getHomeBalance() {
        return homeBalance;
    }

    public void setHomeBalance(double homeBalance) {
        this.homeBalance = homeBalance;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public double getRemainingCredit() {
        return remainingCredit;
    }

    public void setRemainingCredit(double remainingCredit) {
        this.remainingCredit = remainingCredit;
    }

    public Object getRecurDataRef() {
        return recurDataRef;
    }

    public void setRecurDataRef(Object recurDataRef) {
        this.recurDataRef = recurDataRef;
    }

    public Object getTaxExemptionRef() {
        return taxExemptionRef;
    }

    public void setTaxExemptionRef(Object taxExemptionRef) {
        this.taxExemptionRef = taxExemptionRef;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getHomeTotalAmt() {
        return homeTotalAmt;
    }

    public void setHomeTotalAmt(double homeTotalAmt) {
        this.homeTotalAmt = homeTotalAmt;
    }
}