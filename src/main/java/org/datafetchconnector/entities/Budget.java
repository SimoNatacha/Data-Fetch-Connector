package org.datafetchconnector.entities;

import com.intuit.ipp.data.BudgetDetail;
import com.intuit.ipp.data.BudgetEntryTypeEnum;
import com.intuit.ipp.data.ModificationMetaData;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "syncToken")
    private String syncToken;


    @Column(name = "budgetEntryType")
    private String budgetEntryType;

    @Column(name = "name")
    private String name;

    @Type(type = "json")
    @Column(name = "budgetDetail ", columnDefinition = "json")
    private Object budgetDetail ;

    @Column(name = "budgetType")
    private String budgetType;

    @Column(name = "active")
    private Boolean active;

    @Type(type = "json")
    @Column(name = "metaData", columnDefinition = "json")
    private Object metaData;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getSyncToken() {
        return syncToken;
    }

    public void setSyncToken(String syncToken) {
        this.syncToken = syncToken;
    }

    public String getBudgetEntryType() {
        return budgetEntryType;
    }

    public void setBudgetEntryType(String budgetEntryType) {
        this.budgetEntryType = budgetEntryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBudgetDetail() {
        return budgetDetail;
    }

    public void setBudgetDetail(Object budgetDetail) {
        this.budgetDetail = budgetDetail;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }
}