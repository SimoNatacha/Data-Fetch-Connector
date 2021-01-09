package org.datafetchconnector.entities;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
@Entity
@Table(name="bill")
public class Bill {


    @EmbeddedId
    private CompositeKey compositeKey;

    @Column(name = "id", insertable = false, updatable = false)
    private Integer id;


    @MapsId("user_id")
    @ManyToOne()
    private User user;


    public CompositeKey getCompositeKey() {
        return compositeKey;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setCompositeKey(CompositeKey compositeKey) {
        this.compositeKey = compositeKey;
    }





    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object vendorRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object line;

    private String syncToken;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object currencyRef;

    private Date txnDate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object apAccountRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object salesTermRef;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object linkedTxn;

    private String globalTaxCalculation;
    private Double totalAmt;
    private String transactionLocationType;
    private Date dueDate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object metaData;

    private String docNumber;
    private String privateNote;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object txnTaxDetail;

    private Double exchangeRate;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object departmentRef;

    private Boolean includeInAnnualTPAR;
    private Double homeBalance;

    @Type(type = "json")
    @Column(columnDefinition = "json")
    private Object recurDataRef;

    private Double balance;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}