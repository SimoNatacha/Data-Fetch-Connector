package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Bill;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class BillDao{


    Session session = Connection.getSessionFactory().openSession();

    public String insertNewBill(Bill bill) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(bill);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Bill Information saved successfully: " ;
    }




}