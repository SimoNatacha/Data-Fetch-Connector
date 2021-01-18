package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "vendor")
public class Vendor {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "DisplayName")
    private String DisplayName;

    @Column(name = "SyncToken")
    private String SyncToken;

    @Column(name = "Title")
    private String Title;

    @Column(name = "GivenName")
    private String GivenName;

    @Column(name = "MiddleName")
    private String MiddleName;

    @Column(name = "Suffix")
    private String Suffix;

    @Column(name = "FamilyName")
    private String FamilyName;

    @Column(name = "PrimaryEmailAddr")
    private EmailAddress PrimaryEmailAddr;

    @Column(name = "otherContactInfo")
    private ContactInfo OtherContactInfo;

    @Column(name = "APAccountRef")
    private String APAccountRef;

    @Column(name = "TermRef")
    private String TermRef;

    @Column(name = "GSTIN")
    private String GSTIN;

    @Column(name = "Fax")
    private TelephoneNumber Fax;

    @Column(name = "BusinessNumber")
    private String BusinessNumber;

    @Column(name = "CurrencyRef", length = 16)
    private String CurrencyRef;

    @Column(name = "HasTPAR")
    private Boolean HasTPAR;

    @Column(name = "TaxReportingBasis")
    private String TaxReportingBasis;

    @Column(name = "Mobile")
    private TelephoneNumber Mobile;

    @Column(name = "PrimaryPhone")
    private TelephoneNumber PrimaryPhone;

    @Column(name = "Active")
    private Boolean Active;

    @Column(name = "AlternatePhone")
    private TelephoneNumber AlternatePhone;

    @Column(name = "MetaData")
    private ModificationMetaData MetaData;

    @Column(name = "Vendor1099")
    private Boolean Vendor1099;

    @Column(name = "BillRate")
    private Long BillRate;

    @Column(name = "WebAddr")
    private WebSiteAddress WebAddr;

    @Column(name = "CompanyName")
    private String CompanyName;

    @Column(name = "VendorPaymentBankDetail")
    private String VendorPaymentBankDetail;

    @Column(name = "TaxIdentifier")
    private String TaxIdentifier;

    @Column(name = "BillAddr")
    private PhysicalAddress BillAddr;

    @Column(name = "AcctNum")
    private String AcctNum;

    @Column(name = "GSTRegistrationType")
    private String GSTRegistrationType;

    @Column(name = "PrintOnCheckName")
    private String PrintOnCheckName;

    @Column(name = "Balance")
    private Long Balance;

    public Vendor(Integer id, String syncToken, String title, String givenName, String middleName, String suffix, String familyName) {
        this.id = id;
        SyncToken = syncToken;
        Title = title;
        GivenName = givenName;
        MiddleName = middleName;
        Suffix = suffix;
        FamilyName = familyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public String getSyncToken() {
        return SyncToken;
    }

    public void setSyncToken(String syncToken) {
        SyncToken = syncToken;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGivenName() {
        return GivenName;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getSuffix() {
        return Suffix;
    }

    public void setSuffix(String suffix) {
        Suffix = suffix;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public EmailAddress getPrimaryEmailAddr() {
        return PrimaryEmailAddr;
    }

    public void setPrimaryEmailAddr(EmailAddress primaryEmailAddr) {
        PrimaryEmailAddr = primaryEmailAddr;
    }

    public ContactInfo getOtherContactInfo() {
        return OtherContactInfo;
    }

    public void setOtherContactInfo(ContactInfo otherContactInfo) {
        OtherContactInfo = otherContactInfo;
    }

    public String getAPAccountRef() {
        return APAccountRef;
    }

    public void setAPAccountRef(String APAccountRef) {
        this.APAccountRef = APAccountRef;
    }

    public String getTermRef() {
        return TermRef;
    }

    public void setTermRef(String termRef) {
        TermRef = termRef;
    }

    public String getGSTIN() {
        return GSTIN;
    }

    public void setGSTIN(String GSTIN) {
        this.GSTIN = GSTIN;
    }

    public TelephoneNumber getFax() {
        return Fax;
    }

    public void setFax(TelephoneNumber fax) {
        Fax = fax;
    }

    public String getBusinessNumber() {
        return BusinessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        BusinessNumber = businessNumber;
    }

    public String getCurrencyRef() {
        return CurrencyRef;
    }

    public void setCurrencyRef(String currencyRef) {
        CurrencyRef = currencyRef;
    }

    public Boolean getHasTPAR() {
        return HasTPAR;
    }

    public void setHasTPAR(Boolean hasTPAR) {
        HasTPAR = hasTPAR;
    }

    public String getTaxReportingBasis() {
        return TaxReportingBasis;
    }

    public void setTaxReportingBasis(String taxReportingBasis) {
        TaxReportingBasis = taxReportingBasis;
    }

    public TelephoneNumber getMobile() {
        return Mobile;
    }

    public void setMobile(TelephoneNumber mobile) {
        Mobile = mobile;
    }

    public TelephoneNumber getPrimaryPhone() {
        return PrimaryPhone;
    }

    public void setPrimaryPhone(TelephoneNumber primaryPhone) {
        PrimaryPhone = primaryPhone;
    }

    public Boolean getActive() {
        return Active;
    }

    public void setActive(Boolean active) {
        Active = active;
    }

    public TelephoneNumber getAlternatePhone() {
        return AlternatePhone;
    }

    public void setAlternatePhone(TelephoneNumber alternatePhone) {
        AlternatePhone = alternatePhone;
    }

    public ModificationMetaData getMetaData() {
        return MetaData;
    }

    public void setMetaData(ModificationMetaData metaData) {
        MetaData = metaData;
    }

    public Boolean getVendor1099() {
        return Vendor1099;
    }

    public void setVendor1099(Boolean vendor1099) {
        Vendor1099 = vendor1099;
    }

    public Long getBillRate() {
        return BillRate;
    }

    public void setBillRate(Long billRate) {
        BillRate = billRate;
    }

    public WebSiteAddress getWebAddr() {
        return WebAddr;
    }

    public void setWebAddr(WebSiteAddress webAddr) {
        WebAddr = webAddr;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getVendorPaymentBankDetail() {
        return VendorPaymentBankDetail;
    }

    public void setVendorPaymentBankDetail(String vendorPaymentBankDetail) {
        VendorPaymentBankDetail = vendorPaymentBankDetail;
    }

    public String getTaxIdentifier() {
        return TaxIdentifier;
    }

    public void setTaxIdentifier(String taxIdentifier) {
        TaxIdentifier = taxIdentifier;
    }

    public PhysicalAddress getBillAddr() {
        return BillAddr;
    }

    public void setBillAddr(PhysicalAddress billAddr) {
        BillAddr = billAddr;
    }

    public String getAcctNum() {
        return AcctNum;
    }

    public void setAcctNum(String acctNum) {
        AcctNum = acctNum;
    }

    public String getGSTRegistrationType() {
        return GSTRegistrationType;
    }

    public void setGSTRegistrationType(String GSTRegistrationType) {
        this.GSTRegistrationType = GSTRegistrationType;
    }

    public String getPrintOnCheckName() {
        return PrintOnCheckName;
    }

    public void setPrintOnCheckName(String printOnCheckName) {
        PrintOnCheckName = printOnCheckName;
    }

    public Long getBalance() {
        return Balance;
    }

    public void setBalance(Long balance) {
        Balance = balance;
    }
}