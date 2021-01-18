package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "TotalAmt")
    private Long TotalAmt;

    @Column(name = "PaymentMethodRef")
    private String PaymentMethodRef;

    @Column(name = "UnappliedAmt")
    private Long UnappliedAmt;

    @Column(name = "ExchangeRate")
    private String ExchangeRate;

    @Column(name = "Line")
    private String Line;

    @Column(name = "SyncToken")
    private String SyncToken;

    @Column(name = "CustomerRef")
    private String CustomerRef;

    @Column(name = "CurrencyRef")
    private String CurrencyRef;


    @Column(name = "LinkedTxn")
    private LinkedTxn LinkedTxn;

    @Column(name = "TxnSource")
    private String TxnSource;

    @Column(name = "ARAccountRef")
    private String ARAccountRef;

    @Column(name = "TxnDate")
    private Date TxnDate;

    @Column(name = "CreditCardPayment")
    private CreditCardPayment CreditCardPayment;

    @Column(name = "TransactionLocationType")
    private String TransactionLocationType;

    @Column(name = "TaxExemptionRef")
    private String TaxExemptionRef;

    @Column(name = "MetaData")
    private ModificationMetaData MetaData;

    @Column(name = "PaymentRefNum")
    private String PaymentRefNum;

    @Column(name = "PrivateNote")
    private String PrivateNote;

    @Column(name = "DepositToAccountRef")
    private String DepositToAccountRef;

    public Payment(Integer id, Long totalAmt, String syncToken, String customerRef, String currencyRef) {
        this.id = id;
        TotalAmt = totalAmt;
        SyncToken = syncToken;
        CustomerRef = customerRef;
        CurrencyRef = currencyRef;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(Long totalAmt) {
        TotalAmt = totalAmt;
    }

    public String getPaymentMethodRef() {
        return PaymentMethodRef;
    }

    public void setPaymentMethodRef(String paymentMethodRef) {
        PaymentMethodRef = paymentMethodRef;
    }

    public Long getUnappliedAmt() {
        return UnappliedAmt;
    }

    public void setUnappliedAmt(Long unappliedAmt) {
        UnappliedAmt = unappliedAmt;
    }

    public String getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        ExchangeRate = exchangeRate;
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

    public String getCustomerRef() {
        return CustomerRef;
    }

    public void setCustomerRef(String customerRef) {
        CustomerRef = customerRef;
    }

    public String getCurrencyRef() {
        return CurrencyRef;
    }

    public void setCurrencyRef(String currencyRef) {
        CurrencyRef = currencyRef;
    }

    public com.intuit.ipp.data.LinkedTxn getLinkedTxn() {
        return LinkedTxn;
    }

    public void setLinkedTxn(com.intuit.ipp.data.LinkedTxn linkedTxn) {
        LinkedTxn = linkedTxn;
    }

    public String getTxnSource() {
        return TxnSource;
    }

    public void setTxnSource(String txnSource) {
        TxnSource = txnSource;
    }

    public String getARAccountRef() {
        return ARAccountRef;
    }

    public void setARAccountRef(String ARAccountRef) {
        this.ARAccountRef = ARAccountRef;
    }

    public Date getTxnDate() {
        return TxnDate;
    }

    public void setTxnDate(Date txnDate) {
        TxnDate = txnDate;
    }

    public com.intuit.ipp.data.CreditCardPayment getCreditCardPayment() {
        return CreditCardPayment;
    }

    public void setCreditCardPayment(com.intuit.ipp.data.CreditCardPayment creditCardPayment) {
        CreditCardPayment = creditCardPayment;
    }

    public String getTransactionLocationType() {
        return TransactionLocationType;
    }

    public void setTransactionLocationType(String transactionLocationType) {
        TransactionLocationType = transactionLocationType;
    }

    public String getTaxExemptionRef() {
        return TaxExemptionRef;
    }

    public void setTaxExemptionRef(String taxExemptionRef) {
        TaxExemptionRef = taxExemptionRef;
    }

    public ModificationMetaData getMetaData() {
        return MetaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        MetaData = metaData;
    }

    public String getPaymentRefNum() {
        return PaymentRefNum;
    }

    public void setPaymentRefNum(String paymentRefNum) {
        PaymentRefNum = paymentRefNum;
    }

    public String getPrivateNote() {
        return PrivateNote;
    }

    public void setPrivateNote(String privateNote) {
        PrivateNote = privateNote;
    }

    public String getDepositToAccountRef() {
        return DepositToAccountRef;
    }

    public void setDepositToAccountRef(String depositToAccountRef) {
        DepositToAccountRef = depositToAccountRef;
    }
}