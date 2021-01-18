package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.Date;

@XmlRootElement
@Entity
@Table(name = "invoice")
public class Invoice {
    @EmbeddedId
    private CompositeKey compositeKey;

    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;


    @MapsId("user_id")
    @ManyToOne()
    private User user;

    private String trackingNum;

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


    private String printStatus;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object classRef;


    private Date txnDate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object salesTermRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object apAccountRef;


    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object linkedTxn;


    private String txnSource;


    private String globalTaxCalculation;


    private double totalAmt;


    @Type(type = "json")
    @Column(columnDefinition = "json")
    private String transactionLocationType;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object ShipDate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;


    private String docNumber;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billEmail;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipFromAddr;

    private String privateNote;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object txnTaxDetail;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private String depositToAccountRef;


    private boolean allowOnlineACHPayment;


    private boolean allowOnlineCreditCardPayment;

//    @Type(type = "json")
//    @Column(columnDefinition = "json")
//    private Object dueDate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billEmailCc;


    private String emailStatus;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customerMemo;


    private String exchangeRate;


    private double deposit;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object customField;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipAddr;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billAddr;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object billEmailBcc;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object shipMethodRef;


    private boolean applyTaxAfterDiscount;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object deliveryInfo;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object departmentRef;


    private String invoiceLink;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object taxExemptionRef;


    private double homeBalance;


    private double homeTotalAmt;


    private boolean freeFormAddress;


    private boolean allowOnlinePayment;


    private boolean allowIPNPayment;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object recurDataRef;


    private double Balance;


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

    public String getTrackingNum() {
        return trackingNum;
    }

    public void setTrackingNum(String trackingNum) {
        this.trackingNum = trackingNum;
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

    public String getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(String printStatus) {
        this.printStatus = printStatus;
    }

    public Object getClassRef() {
        return classRef;
    }

    public void setClassRef(Object classRef) {
        this.classRef = classRef;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public Object getSalesTermRef() {
        return salesTermRef;
    }

    public void setSalesTermRef(Object salesTermRef) {
        this.salesTermRef = salesTermRef;
    }

    public Object getLinkedTxn() {
        return linkedTxn;
    }

    public void setLinkedTxn(Object linkedTxn) {
        this.linkedTxn = linkedTxn;
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

    public Object getShipDate() {
        return ShipDate;
    }

    public void setShipDate(Object shipDate) {
        ShipDate = shipDate;
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

    public Object getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(Object billEmail) {
        this.billEmail = billEmail;
    }

    public Object getShipFromAddr() {
        return shipFromAddr;
    }

    public void setShipFromAddr(Object shipFromAddr) {
        this.shipFromAddr = shipFromAddr;
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

    public String getDepositToAccountRef() {
        return depositToAccountRef;
    }

    public void setDepositToAccountRef(String depositToAccountRef) {
        this.depositToAccountRef = depositToAccountRef;
    }

    public boolean isAllowOnlineACHPayment() {
        return allowOnlineACHPayment;
    }

    public void setAllowOnlineACHPayment(boolean allowOnlineACHPayment) {
        this.allowOnlineACHPayment = allowOnlineACHPayment;
    }

    public boolean isAllowOnlineCreditCardPayment() {
        return allowOnlineCreditCardPayment;
    }

    public void setAllowOnlineCreditCardPayment(boolean allowOnlineCreditCardPayment) {
        this.allowOnlineCreditCardPayment = allowOnlineCreditCardPayment;
    }

//    public Object getDueDate() {
//        return dueDate;
//    }
//
//    public void setDueDate(Object dueDate) {
//        this.dueDate = dueDate;
//    }

    public Object getBillEmailCc() {
        return billEmailCc;
    }

    public void setBillEmailCc(Object billEmailCc) {
        this.billEmailCc = billEmailCc;
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus;
    }

    public Object getCustomerMemo() {
        return customerMemo;
    }

    public void setCustomerMemo(Object customerMemo) {
        this.customerMemo = customerMemo;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Object getCustomField() {
        return customField;
    }

    public void setCustomField(Object customField) {
        this.customField = customField;
    }

    public Object getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(Object shipAddr) {
        this.shipAddr = shipAddr;
    }

    public Object getBillAddr() {
        return billAddr;
    }

    public void setBillAddr(Object billAddr) {
        this.billAddr = billAddr;
    }

    public Object getBillEmailBcc() {
        return billEmailBcc;
    }

    public void setBillEmailBcc(Object billEmailBcc) {
        this.billEmailBcc = billEmailBcc;
    }

    public Object getShipMethodRef() {
        return shipMethodRef;
    }

    public void setShipMethodRef(Object shipMethodRef) {
        this.shipMethodRef = shipMethodRef;
    }

    public boolean isApplyTaxAfterDiscount() {
        return applyTaxAfterDiscount;
    }

    public void setApplyTaxAfterDiscount(boolean applyTaxAfterDiscount) {
        this.applyTaxAfterDiscount = applyTaxAfterDiscount;
    }

    public Object getDeliveryInfo() {
        return deliveryInfo;
    }

    public void setDeliveryInfo(Object deliveryInfo) {
        this.deliveryInfo = deliveryInfo;
    }

    public Object getDepartmentRef() {
        return departmentRef;
    }

    public void setDepartmentRef(Object departmentRef) {
        this.departmentRef = departmentRef;
    }

    public String getInvoiceLink() {
        return invoiceLink;
    }

    public void setInvoiceLink(String invoiceLink) {
        this.invoiceLink = invoiceLink;
    }

    public Object getTaxExemptionRef() {
        return taxExemptionRef;
    }

    public void setTaxExemptionRef(Object taxExemptionRef) {
        this.taxExemptionRef = taxExemptionRef;
    }

    public double getHomeBalance() {
        return homeBalance;
    }

    public void setHomeBalance(double homeBalance) {
        this.homeBalance = homeBalance;
    }

    public double getHomeTotalAmt() {
        return homeTotalAmt;
    }

    public void setHomeTotalAmt(double homeTotalAmt) {
        this.homeTotalAmt = homeTotalAmt;
    }

    public boolean isFreeFormAddress() {
        return freeFormAddress;
    }

    public void setFreeFormAddress(boolean freeFormAddress) {
        this.freeFormAddress = freeFormAddress;
    }

    public boolean isAllowOnlinePayment() {
        return allowOnlinePayment;
    }

    public void setAllowOnlinePayment(boolean allowOnlinePayment) {
        this.allowOnlinePayment = allowOnlinePayment;
    }

    public boolean isAllowIPNPayment() {
        return allowIPNPayment;
    }

    public void setAllowIPNPayment(boolean allowIPNPayment) {
        this.allowIPNPayment = allowIPNPayment;
    }

    public Object getRecurDataRef() {
        return recurDataRef;
    }

    public void setRecurDataRef(Object recurDataRef) {
        this.recurDataRef = recurDataRef;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public Object getApAccountRef() {
        return apAccountRef;
    }

    public void setApAccountRef(Object apAccountRef) {
        this.apAccountRef = apAccountRef;
    }

    public double getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(double totalAmt) {
        this.totalAmt = totalAmt;
    }
}