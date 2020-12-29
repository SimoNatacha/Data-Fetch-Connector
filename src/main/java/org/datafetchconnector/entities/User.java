package org.datafetchconnector.entities;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "accesToken",columnDefinition = "TEXT" , length = 65535)
    private String accesToken;

    @Column(name = "refresh_token",columnDefinition = "TEXT",length = 65535)
    private String refresh_token;

    @Column(name = "realmid",columnDefinition = "TEXT",length = 65535)
    private String realmId;
    @Column(name = "connected_date")
    private Date connected_date;

    @Column(name = "code",columnDefinition = "TEXT",length = 65535)
    private String code;

    @Column(name = "state",columnDefinition = "TEXT",length = 65535)
    private String state;

    public User() {
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getRealmId() {
        return realmId;
    }

    public void setRealmId(String realmId) {
        this.realmId = realmId;
    }
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccesToken() {
        return accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }


    public Date setConnected_date() throws ParseException {

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Date today = new Date();

        this.connected_date = formatter.parse(formatter.format(today));
        return connected_date;
    }

    public Date getConnected_date() {
        return connected_date;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
