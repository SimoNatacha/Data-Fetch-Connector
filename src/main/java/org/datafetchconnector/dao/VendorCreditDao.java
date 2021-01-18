package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Account;
import org.datafetchconnector.entities.Customer;
import org.datafetchconnector.entities.VendorCredit;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VendorCreditDao {
    Session session = Connection.getSessionFactory().openSession();

    public String insertNewVendorCredit(VendorCredit vendorCredit) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(vendorCredit);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "VendorCredit Information saved successfully: " ;
    }



}