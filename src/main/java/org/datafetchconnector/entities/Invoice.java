package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "TrackingNum")
    private String TrackingNum;

    @Column(name = "Line")
    private String Line;

    @Column(name = "SyncToken")
    private String SyncToken;

    @Column(name = "CustomerRef")
    private String CustomerRef;

    @Column(name = "CurrencyRef")
    private String CurrencyRef;

    @Column(name = "PrintStatus")
    private String PrintStatus;

    @Column(name = "TxnDate")
    private Date TxnDate;

    @Column(name = "SalesTermRef")
    private String SalesTermRef;

    @Column(name = "APAccountRef")
    private String APAccountRef;

    @Column(name = "ClassRef")
    private String ClassRef;

    @Column(name = "LinkedTxn")
    private LinkedTxn LinkedTxn;

    @Column(name = "TxnSource")
    private String TxnSource;

    @Column(name = "GlobalTaxCalculation")
    private GlobalTaxCalculationEnum GlobalTaxCalculation;

    @Column(name = "TotalAmt")
    private BigDecimal TotalAmt;


    @Column(name = "TransactionLocationType")
    private String TransactionLocationType;

    @Column(name = "ShipDate")
    private Date ShipDate;

    @Column(name = "MetaData")
    private ModificationMetaData MetaData;

    @Column(name = "DocNumber")
    private String DocNumber;

    @Column(name = "BillEmail")
    private EmailAddress BillEmail;

    @Column(name = "ShipFromAddr")
    private PhysicalAddress  ShipFromAddr;

    @Column(name = "PrivateNote")
    private String PrivateNote;

    @Column(name = "TxnTaxDetail")
    private TxnTaxDetail TxnTaxDetail;

    @Column(name = "DepositToAccountRef")
    private String DepositToAccountRef;

    @Column(name = "AllowOnlineACHPayment")
    private Boolean AllowOnlineACHPayment ;

    @Column(name = "AllowOnlineCreditCardPayment")
    private Boolean AllowOnlineCreditCardPayment ;

    @Column(name = "DueDate")
    private Date DueDate;

    @Column(name = "BillEmailCc")
    private EmailAddress BillEmailCc;

    @Column(name = "EmailStatus")
    private String EmailStatus;

    @Column(name = "CustomerMemo")
    private MemoRef CustomerMemo;

    @Column(name = "ExchangeRate")
    private String ExchangeRate;

    @Column(name = "Deposit")
    private Long Deposit;

    @Column(name = "CustomField")
    private CustomField CustomField;

    @Column(name = "ShipAddr")
    private PhysicalAddress  ShipAddr;

    @Column(name = "BillAddr")
    private PhysicalAddress  BillAddr;

    @Column(name = "BillEmailBcc")
    private EmailAddress BillEmailBcc;

    @Column(name = "ShipMethodRef")
    private String ShipMethodRef;

    @Column(name = "ApplyTaxAfterDiscount")
    private Boolean ApplyTaxAfterDiscount ;

    @Column(name = "DeliveryInfo")
    private String DeliveryInfo;

    @Column(name = "DepartmentRef")
    private String DepartmentRef;

    @Column(name = "InvoiceLink")
    private String InvoiceLink;

    @Column(name = "TaxExemptionRef")
    private String TaxExemptionRef;

    @Column(name = "HomeBalance")
    private Long HomeBalance;

    @Column(name = "HomeTotalAmt")
    private Long HomeTotalAmt;

    @Column(name = "FreeFormAddress")
    private Boolean FreeFormAddress;

    @Column(name = "AllowOnlinePayment")
    private Boolean AllowOnlinePayment;

    @Column(name = "AllowIPNPayment")
    private Boolean AllowIPNPayment;

    @Column(name = "RecurDataRef")
    private String RecurDataRef;

    @Column(name = "Balance")
    private Long Balance;

    public Invoice() {
    }

    public Invoice(Integer id, String line, String syncToken, String customerRef, String currencyRef, String docNumber, EmailAddress billEmail) {
        this.id = id;
        Line = line;
        SyncToken = syncToken;
        CustomerRef = customerRef;
        CurrencyRef = currencyRef;
        DocNumber = docNumber;
        BillEmail = billEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrackingNum() {
        return TrackingNum;
    }

    public void setTrackingNum(String trackingNum) {
        TrackingNum = trackingNum;
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

    public String getPrintStatus() {
        return PrintStatus;
    }

    public void setPrintStatus(String printStatus) {
        PrintStatus = printStatus;
    }

    public Date getTxnDate() {
        return TxnDate;
    }

    public void setTxnDate(Date txnDate) {
        TxnDate = txnDate;
    }

    public String getSalesTermRef() {
        return SalesTermRef;
    }

    public void setSalesTermRef(String salesTermRef) {
        SalesTermRef = salesTermRef;
    }

    public String getAPAccountRef() {
        return APAccountRef;
    }

    public void setAPAccountRef(String APAccountRef) {
        this.APAccountRef = APAccountRef;
    }

    public String getClassRef() {
        return ClassRef;
    }

    public void setClassRef(String classRef) {
        ClassRef = classRef;
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

    public GlobalTaxCalculationEnum getGlobalTaxCalculation() {
        return GlobalTaxCalculation;
    }

    public void setGlobalTaxCalculation(GlobalTaxCalculationEnum globalTaxCalculation) {
        GlobalTaxCalculation = globalTaxCalculation;
    }

    public BigDecimal getTotalAmt() {
        return TotalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        TotalAmt = totalAmt;
    }

    public String getTransactionLocationType() {
        return TransactionLocationType;
    }

    public void setTransactionLocationType(String transactionLocationType) {
        TransactionLocationType = transactionLocationType;
    }

    public Date getShipDate() {
        return ShipDate;
    }

    public void setShipDate(Date shipDate) {
        ShipDate = shipDate;
    }

    public ModificationMetaData getMetaData() {
        return MetaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        MetaData = metaData;
    }

    public String getDocNumber() {
        return DocNumber;
    }

    public void setDocNumber(String docNumber) {
        DocNumber = docNumber;
    }

    public EmailAddress getBillEmail() {
        return BillEmail;
    }

    public void setBillEmail(EmailAddress billEmail) {
        BillEmail = billEmail;
    }

    public PhysicalAddress getShipFromAddr() {
        return ShipFromAddr;
    }

    public void setShipFromAddr(PhysicalAddress shipFromAddr) {
        ShipFromAddr = shipFromAddr;
    }

    public String getPrivateNote() {
        return PrivateNote;
    }

    public void setPrivateNote(String privateNote) {
        PrivateNote = privateNote;
    }

    public com.intuit.ipp.data.TxnTaxDetail getTxnTaxDetail() {
        return TxnTaxDetail;
    }

    public void setTxnTaxDetail(com.intuit.ipp.data.TxnTaxDetail txnTaxDetail) {
        TxnTaxDetail = txnTaxDetail;
    }

    public String getDepositToAccountRef() {
        return DepositToAccountRef;
    }

    public void setDepositToAccountRef(String depositToAccountRef) {
        DepositToAccountRef = depositToAccountRef;
    }

    public Boolean getAllowOnlineACHPayment() {
        return AllowOnlineACHPayment;
    }

    public void setAllowOnlineACHPayment(Boolean allowOnlineACHPayment) {
        AllowOnlineACHPayment = allowOnlineACHPayment;
    }

    public Boolean getAllowOnlineCreditCardPayment() {
        return AllowOnlineCreditCardPayment;
    }

    public void setAllowOnlineCreditCardPayment(Boolean allowOnlineCreditCardPayment) {
        AllowOnlineCreditCardPayment = allowOnlineCreditCardPayment;
    }

    public Date getDueDate() {
        return DueDate;
    }

    public void setDueDate(Date dueDate) {
        DueDate = dueDate;
    }

    public EmailAddress getBillEmailCc() {
        return BillEmailCc;
    }

    public void setBillEmailCc(EmailAddress billEmailCc) {
        BillEmailCc = billEmailCc;
    }

    public String getEmailStatus() {
        return EmailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        EmailStatus = emailStatus;
    }

    public MemoRef getCustomerMemo() {
        return CustomerMemo;
    }

    public void setCustomerMemo(MemoRef customerMemo) {
        CustomerMemo = customerMemo;
    }

    public String getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        ExchangeRate = exchangeRate;
    }

    public Long getDeposit() {
        return Deposit;
    }

    public void setDeposit(Long deposit) {
        Deposit = deposit;
    }

    public com.intuit.ipp.data.CustomField getCustomField() {
        return CustomField;
    }

    public void setCustomField(com.intuit.ipp.data.CustomField customField) {
        CustomField = customField;
    }

    public PhysicalAddress getShipAddr() {
        return ShipAddr;
    }

    public void setShipAddr(PhysicalAddress shipAddr) {
        ShipAddr = shipAddr;
    }

    public PhysicalAddress getBillAddr() {
        return BillAddr;
    }

    public void setBillAddr(PhysicalAddress billAddr) {
        BillAddr = billAddr;
    }

    public EmailAddress getBillEmailBcc() {
        return BillEmailBcc;
    }

    public void setBillEmailBcc(EmailAddress billEmailBcc) {
        BillEmailBcc = billEmailBcc;
    }

    public String getShipMethodRef() {
        return ShipMethodRef;
    }

    public void setShipMethodRef(String shipMethodRef) {
        ShipMethodRef = shipMethodRef;
    }

    public Boolean getApplyTaxAfterDiscount() {
        return ApplyTaxAfterDiscount;
    }

    public void setApplyTaxAfterDiscount(Boolean applyTaxAfterDiscount) {
        ApplyTaxAfterDiscount = applyTaxAfterDiscount;
    }

    public String getDeliveryInfo() {
        return DeliveryInfo;
    }

    public void setDeliveryInfo(String deliveryInfo) {
        DeliveryInfo = deliveryInfo;
    }

    public String getDepartmentRef() {
        return DepartmentRef;
    }

    public void setDepartmentRef(String departmentRef) {
        DepartmentRef = departmentRef;
    }

    public String getInvoiceLink() {
        return InvoiceLink;
    }

    public void setInvoiceLink(String invoiceLink) {
        InvoiceLink = invoiceLink;
    }

    public String getTaxExemptionRef() {
        return TaxExemptionRef;
    }

    public void setTaxExemptionRef(String taxExemptionRef) {
        TaxExemptionRef = taxExemptionRef;
    }

    public Long getHomeBalance() {
        return HomeBalance;
    }

    public void setHomeBalance(Long homeBalance) {
        HomeBalance = homeBalance;
    }

    public Long getHomeTotalAmt() {
        return HomeTotalAmt;
    }

    public void setHomeTotalAmt(Long homeTotalAmt) {
        HomeTotalAmt = homeTotalAmt;
    }

    public Boolean getFreeFormAddress() {
        return FreeFormAddress;
    }

    public void setFreeFormAddress(Boolean freeFormAddress) {
        FreeFormAddress = freeFormAddress;
    }

    public Boolean getAllowOnlinePayment() {
        return AllowOnlinePayment;
    }

    public void setAllowOnlinePayment(Boolean allowOnlinePayment) {
        AllowOnlinePayment = allowOnlinePayment;
    }

    public Boolean getAllowIPNPayment() {
        return AllowIPNPayment;
    }

    public void setAllowIPNPayment(Boolean allowIPNPayment) {
        AllowIPNPayment = allowIPNPayment;
    }

    public String getRecurDataRef() {
        return RecurDataRef;
    }

    public void setRecurDataRef(String recurDataRef) {
        RecurDataRef = recurDataRef;
    }

    public Long getBalance() {
        return Balance;
    }

    public void setBalance(Long balance) {
        Balance = balance;
    }
}