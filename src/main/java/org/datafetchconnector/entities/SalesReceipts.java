package org.datafetchconnector.entities;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@XmlRootElement
@Entity
@Table(name="salesreceipt")
public class SalesReceipts extends BaseEntity {


    @EmbeddedId
    private CompositeKey compositeKey;
    //
    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;
    //
    @MapsId("user_id")
    @ManyToOne()
    private User user;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object line;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customerRef;

    private String syncToken;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object currencyRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billEmail;
    private Date txnDate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipFromAddr;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customField;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipDate;

    private String trackingNum;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object classRef;

    private String printStatus;
    private String paymentRefNum;
    private String txnSource;
    private String globalTaxCalculation;
    private String transactionLocationType;
    private Boolean applyTaxAfterDiscount;
    private String docNumber;
    private String privateNote;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object depositToAccountRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customerMemo;

    private String emailStatus;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object creditCardPayment;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object txnTaxDetail;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object paymentMethodRef;

    private Double exchangeRate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipAddr;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object departmentRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipMethodRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billAddr;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;

    private Double homeBalance;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object deliveryInfo;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object recurDataRef;

    private Double totalAmt;
    private Double balance;
    private Double homeTotalAmt;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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

    public Object getLine() {
        return line;
    }

    public void setLine(Object line) {
        this.line = line;
    }

    public Object getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(Object customerRef) {
        this.customerRef = customerRef;
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

    public Object getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(Object billEmail) {
        this.billEmail = billEmail;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public Object getShipFromAddr() {
        return shipFromAddr;
    }

    public void setShipFromAddr(Object shipFromAddr) {
        this.shipFromAddr = shipFromAddr;
    }

    public Object getCustomField() {
        return customField;
    }

    public void setCustomField(Object customField) {
        this.customField = customField;
    }

    public Object getShipDate() {
        return shipDate;
    }

    public void setShipDate(Object shipDate) {
        this.shipDate = shipDate;
    }

    public String getTrackingNum() {
        return trackingNum;
    }

    public void setTrackingNum(String trackingNum) {
        this.trackingNum = trackingNum;
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

    public String getPaymentRefNum() {
        return paymentRefNum;
    }

    public void setPaymentRefNum(String paymentRefNum) {
        this.paymentRefNum = paymentRefNum;
    }

    public String getTxnSource() {
        return txnSource;
    }

    public void setTxnSource(String txnSource) {
        this.txnSource = txnSource;
    }

    public String getGlobalTaxCalculation() {
        return globalTaxCalculation;
    }

    public void setGlobalTaxCalculation(String globalTaxCalculation) {
        this.globalTaxCalculation = globalTaxCalculation;
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

    public Object getDepositToAccountRef() {
        return depositToAccountRef;
    }

    public void setDepositToAccountRef(Object depositToAccountRef) {
        this.depositToAccountRef = depositToAccountRef;
    }

    public Object getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(Object customerMemo) {
        this.customerMemo = customerMemo;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Object getCreditCardPayment() {
        return creditCardPayment;
    }

    public void setCreditCardPayment(Object creditCardPayment) {
        this.creditCardPayment = creditCardPayment;
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

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
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

    public Object getShipMethodRef() {
        return shipMethodRef;
    }

    public void setShipMethodRef(Object shipMethodRef) {
        this.shipMethodRef = shipMethodRef;
    }

    public Object getBillAddr() {
        return billAddr;
    }

    public void setBillAddr(Object billAddr) {
        this.billAddr = billAddr;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }

    public Double getHomeBalance() {
        return homeBalance;
    }

    public void setHomeBalance(Double homeBalance) {
        this.homeBalance = homeBalance;
    }

    public Object getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(Object deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public Object getRecurDataRef() {
        return recurDataRef;
    }

    public void setRecurDataRef(Object recurDataRef) {
        this.recurDataRef = recurDataRef;
    }

    public Double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Double totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getHomeTotalAmt() {
        return homeTotalAmt;
    }

    public void setHomeTotalAmt(Double homeTotalAmt) {
        this.homeTotalAmt = homeTotalAmt;
    }
}

