package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;
import org.hibernate.annotations.Type;

import javax.lang.model.type.ReferenceType;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "DisplayName")
    private String DisplayName;

    @Column(name = "SyncToken")
    private String SyncToken;

    @Column(name = "PrimaryAddr")
    private PhysicalAddress PrimaryAddr;

    @Type(type = "json")
    @Column(name = "primaryEmailAddr",columnDefinition = "json")
    private EmailAddress PrimaryEmailAddr;

    @Column(name = "Title")
    private String Title;

    @Column(name = "BillableTime")
    private Boolean BillableTime;

    @Column(name = "GivenName")
    private String GivenName;

    @Column(name = "BirthDate")
    private Date BirthDate;

    @Column(name = "ReleasedDate")
    private Date ReleasedDate;
    @Column(name = "Gender")
    private String Gender;

    @Column(name = "HiredDate")
    private Date HiredDate;

    @Column(name = "MiddleName")
    private String MiddleName;

    @Column(name = "SSN")
    private String SSN;

    @Column(name = "BillRate")
    private Long BillRate;

    @Column(name = "Organization")
    private Boolean Organization;

    @Column(name = "Suffix")
    private String Suffix;

    @Column(name = "FamilyName")
    private String FamilyName;

    @Column(name = "PrintOnCheckName")
    private String PrintOnCheckName;

    @Column(name = "EmployeeNumber")
    private String EmployeeNumber;

    @Column(name = "V4IDPseudonym")
    private String V4IDPseudonym;


    public Employee() {
    }

    public Employee(Integer id, String syncToken, PhysicalAddress primaryAddr) {
        this.id = id;
        SyncToken = syncToken;
        PrimaryAddr = primaryAddr;
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

    public PhysicalAddress getPrimaryAddr() {
        return PrimaryAddr;
    }

    public void setPrimaryAddr(PhysicalAddress primaryAddr) {
        PrimaryAddr = primaryAddr;
    }

    public EmailAddress getPrimaryEmailAddr() {
        return PrimaryEmailAddr;
    }

    public void setPrimaryEmailAddr(EmailAddress primaryEmailAddr) {
        PrimaryEmailAddr = primaryEmailAddr;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Boolean getBillableTime() {
        return BillableTime;
    }

    public void setBillableTime(Boolean billableTime) {
        BillableTime = billableTime;
    }

    public String getGivenName() {
        return GivenName;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Date getReleasedDate() {
        return ReleasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        ReleasedDate = releasedDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Date getHiredDate() {
        return HiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        HiredDate = hiredDate;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Long getBillRate() {
        return BillRate;
    }

    public void setBillRate(Long billRate) {
        BillRate = billRate;
    }

    public Boolean getOrganization() {
        return Organization;
    }

    public void setOrganization(Boolean organization) {
        Organization = organization;
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

    public String getPrintOnCheckName() {
        return PrintOnCheckName;
    }

    public void setPrintOnCheckName(String printOnCheckName) {
        PrintOnCheckName = printOnCheckName;
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public String getV4IDPseudonym() {
        return V4IDPseudonym;
    }

    public void setV4IDPseudonym(String v4IDPseudonym) {
        V4IDPseudonym = v4IDPseudonym;
    }
}