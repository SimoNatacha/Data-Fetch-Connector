package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.controller.QBOController;
import org.datafetchconnector.entities.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONObject;

import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class CustomerDao {


    Session session = Connection.getSessionFactory().openSession();

    public String insertNewCustomer(Customer customer) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(customer);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Customer Information saved successfully: " ;
    }





}