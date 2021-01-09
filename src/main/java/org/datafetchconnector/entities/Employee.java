package org.datafetchconnector.entities;

import com.intuit.ipp.data.*;
import org.hibernate.annotations.Type;

import javax.lang.model.type.ReferenceType;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
@XmlRootElement
@Entity
@Table(name = "employee")
public class Employee {

    @EmbeddedId
    private CompositeKey compositeKey;

    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;


    @MapsId("user_id")
    @ManyToOne()
    private User user;


    private String displayName;

    private String syncToken;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object primaryAddr;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object primaryEmailAddr;


    private String title;


    private Boolean billableTime;


    private String givenName;

    private Date birthDate;


    private Date releasedDate;

    private String gender;


    private Date hiredDate;


    private String middleName;
    private String ssn;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object primaryPhone;

    private boolean active;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object mobile;

    private double billRate;


    private Boolean organization;

    private String suffix;


    private String familyName;


    private String printOnCheckName;


    private String employeeNumber;

    private String v4IDPseudonym;

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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public Object getPrimaryAddr() {
        return primaryAddr;
    }

    public void setPrimaryAddr(Object primaryAddr) {
        this.primaryAddr = primaryAddr;
    }

    public Object getPrimaryEmailAddr() {
        return primaryEmailAddr;
    }

    public void setPrimaryEmailAddr(Object primaryEmailAddr) {
        this.primaryEmailAddr = primaryEmailAddr;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getBillableTime() {
        return billableTime;
    }

    public void setBillableTime(Boolean billableTime) {
        this.billableTime = billableTime;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Date releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Object getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(Object primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }

    public Object getMobile() {
        return mobile;
    }

    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public double getBillRate() {
        return billRate;
    }

    public void setBillRate(double billRate) {
        this.billRate = billRate;
    }

    public Boolean getOrganization() {
        return organization;
    }

    public void setOrganization(Boolean organization) {
        this.organization = organization;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getPrintOnCheckName() {
        return printOnCheckName;
    }

    public void setPrintOnCheckName(String printOnCheckName) {
        this.printOnCheckName = printOnCheckName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getV4IDPseudonym() {
        return v4IDPseudonym;
    }

    public void setV4IDPseudonym(String v4IDPseudonym) {
        this.v4IDPseudonym = v4IDPseudonym;
    }
}