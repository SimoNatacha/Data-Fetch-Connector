package org.datafetchconnector.entities;
import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class HII {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "SyncToken")
    private String SyncToken;

    @Column(name = "AcctNum")
    private String AcctNum;


    @Column(name = "CurrencyRef")
    private String CurrencyRef;
    @Column(name = "ParentRef")
    private String ParentRef;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Active")
    private String Active;

    @Column(name = "MetaData")
    private String MetaData;
    @Column(name = "SubAccount")
    private String SubAccount;
    @Column(name = "Classification")
    private String Classification;
    @Column(name = "FullyQualifiedName")
    private String FullyQualifiedName;
    @Column(name = "TxnLocationType")
    private String TxnLocationType;
    @Column(name = "AccountType")
    private String AccountType;
    @Column(name = "CurrentBalanceWithSubAccounts")
    private String CurrentBalanceWithSubAccounts;

    @Column(name = "AccountAlias")
    private String AccountAlias;
    @Column(name = "TaxCodeRef")
    private String TaxCodeRef;

    @Column(name = "AccountSubType")
    private String AccountSubType;
    @Column(name = "CurrentBalance")
    private String CurrentBalance;


    public HII() {
    }

    public HII(String name) {
        this.name = name;

    }

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
        return SyncToken;
    }

    public void setSyncToken(String syncToken) {
        SyncToken = syncToken;
    }

    public String getAcctNum() {
        return AcctNum;
    }

    public void setAcctNum(String acctNum) {
        AcctNum = acctNum;
    }

    public String getCurrencyRef() {
        return CurrencyRef;
    }

    public void setCurrencyRef(String currencyRef) {
        CurrencyRef = currencyRef;
    }

    public String getParentRef() {
        return ParentRef;
    }

    public void setParentRef(String parentRef) {
        ParentRef = parentRef;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getMetaData() {
        return MetaData;
    }

    public void setMetaData(String metaData) {
        MetaData = metaData;
    }

    public String getSubAccount() {
        return SubAccount;
    }

    public void setSubAccount(String subAccount) {
        SubAccount = subAccount;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String classification) {
        Classification = classification;
    }

    public String getFullyQualifiedName() {
        return FullyQualifiedName;
    }

    public void setFullyQualifiedName(String fullyQualifiedName) {
        FullyQualifiedName = fullyQualifiedName;
    }

    public String getTxnLocationType() {
        return TxnLocationType;
    }

    public void setTxnLocationType(String txnLocationType) {
        TxnLocationType = txnLocationType;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getCurrentBalanceWithSubAccounts() {
        return CurrentBalanceWithSubAccounts;
    }

    public void setCurrentBalanceWithSubAccounts(String currentBalanceWithSubAccounts) {
        CurrentBalanceWithSubAccounts = currentBalanceWithSubAccounts;
    }

    public String getAccountAlias() {
        return AccountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        AccountAlias = accountAlias;
    }

    public String getTaxCodeRef() {
        return TaxCodeRef;
    }

    public void setTaxCodeRef(String taxCodeRef) {
        TaxCodeRef = taxCodeRef;
    }

    public String getCurrentBalance() {
        return CurrentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        CurrentBalance = currentBalance;
    }

    public String getAccountSubType() {
        return AccountSubType;
    }

    public void setAccountSubType(String accountSubType) {
        AccountSubType = accountSubType;
    }
}

