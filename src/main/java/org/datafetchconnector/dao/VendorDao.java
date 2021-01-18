package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Vendor;
import org.datafetchconnector.entities.Vendor;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class VendorDao {
    Session session = Connection.getSessionFactory().openSession();

    public String insertNewVendor(Vendor vendor) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(vendor);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Vendor Information saved successfully: " ;
    }



}