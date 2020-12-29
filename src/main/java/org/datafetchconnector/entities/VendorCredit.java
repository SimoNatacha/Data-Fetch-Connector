package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "vendorCredit")
public class VendorCredit {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "VendorRef")
    private String VendorRef;

    @Column(name = "Line")
    private String Line;

    @Column(name = "SyncToken")
    private String SyncToken;

    @Column(name = "CurrencyRef")
    private String CurrencyRef;

    @Column(name = "DocNumber")
    private String DocNumber;

    @Column(name = "PrivateNote")
    private String PrivateNote;

    @Column(name = "LinkedTxn")
    private LinkedTxn LinkedTxn;

    @Column(name = "GlobalTaxCalculation")
    private GlobalTaxCalculationEnum GlobalTaxCalculation;

    @Column(name = "ExchangeRate")
    private Long ExchangeRate;

    @Column(name = "DepartmentRef")
    private String DepartmentRef;

    @Column(name = "APAccountRef")
    private String APAccountRef;

    @Column(name = "TxnDate")
    private Date TxnDate;

    @Column(name = "TransactionLocationType")
    private String TransactionLocationType;

    @Column(name = "IncludeInAnnualTPAR")
    private Boolean IncludeInAnnualTPAR;

    @Column(name = "MetaData")
    private ModificationMetaData MetaData;




    @Column(name = "RecurDataRef")
    private String RecurDataRef;

    @Column(name = "TotalAmt")
    private BigDecimal TotalAmt;


    @Column(name = "Balance")
    private Long Balance;

    public VendorCredit(Integer id, String vendorRef, String line, String syncToken, String currencyRef) {
        this.id = id;
        VendorRef = vendorRef;
        Line = line;
        SyncToken = syncToken;
        CurrencyRef = currencyRef;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVendorRef() {
        return VendorRef;
    }

    public void setVendorRef(String vendorRef) {
        VendorRef = vendorRef;
    }

    public String getLine() {
        return Line;
    }

    public void setLine(String line) {
        Line = line;
    }

    public String getSyncToken() {
        return SyncToken;
    }

    public void setSyncToken(String syncToken) {
        SyncToken = syncToken;
    }

    public String getCurrencyRef() {
        return CurrencyRef;
    }

    public void setCurrencyRef(String currencyRef) {
        CurrencyRef = currencyRef;
    }

    public String getDocNumber() {
        return DocNumber;
    }

    public void setDocNumber(String docNumber) {
        DocNumber = docNumber;
    }

    public String getPrivateNote() {
        return PrivateNote;
    }

    public void setPrivateNote(String privateNote) {
        PrivateNote = privateNote;
    }

    public com.intuit.ipp.data.LinkedTxn getLinkedTxn() {
        return LinkedTxn;
    }

    public void setLinkedTxn(com.intuit.ipp.data.LinkedTxn linkedTxn) {
        LinkedTxn = linkedTxn;
    }

    public GlobalTaxCalculationEnum getGlobalTaxCalculation() {
        return GlobalTaxCalculation;
    }

    public void setGlobalTaxCalculation(GlobalTaxCalculationEnum globalTaxCalculation) {
        GlobalTaxCalculation = globalTaxCalculation;
    }

    public Long getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(Long exchangeRate) {
        ExchangeRate = exchangeRate;
    }

    public String getDepartmentRef() {
        return DepartmentRef;
    }

    public void setDepartmentRef(String departmentRef) {
        DepartmentRef = departmentRef;
    }

    public String getAPAccountRef() {
        return APAccountRef;
    }

    public void setAPAccountRef(String APAccountRef) {
        this.APAccountRef = APAccountRef;
    }

    public Date getTxnDate() {
        return TxnDate;
    }

    public void setTxnDate(Date txnDate) {
        TxnDate = txnDate;
    }

    public String getTransactionLocationType() {
        return TransactionLocationType;
    }

    public void setTransactionLocationType(String transactionLocationType) {
        TransactionLocationType = transactionLocationType;
    }

    public Boolean getIncludeInAnnualTPAR() {
        return IncludeInAnnualTPAR;
    }

    public void setIncludeInAnnualTPAR(Boolean includeInAnnualTPAR) {
        IncludeInAnnualTPAR = includeInAnnualTPAR;
    }

    public ModificationMetaData getMetaData() {
        return MetaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        MetaData = metaData;
    }

    public String getRecurDataRef() {
        return RecurDataRef;
    }

    public void setRecurDataRef(String recurDataRef) {
        RecurDataRef = recurDataRef;
    }

    public BigDecimal getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        TotalAmt = totalAmt;
    }

    public Long getBalance() {
        return Balance;
    }

    public void setBalance(Long balance) {
        Balance = balance;
    }
}