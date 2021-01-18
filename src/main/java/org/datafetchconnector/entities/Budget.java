package org.datafetchconnector.entities;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
@Entity
@Table(name = "budget")
public class Budget {

    @EmbeddedId
    private CompositeKey compositeKey;

    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;


    @MapsId("user_id")
    @ManyToOne()
    private User user;

    private Date endDate;


    private Date startDate;


    private String syncToken;


    private String budgetEntryType;


    private String name;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object budgetDetail;


    private String budgetType;


    private Boolean active;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;


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
