package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Payment;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PaymentDao {
    Session session = Connection.getSessionFactory().openSession();

    public String insertNewPayment(Payment payment) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(payment);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Payment Information saved successfully: " ;
    }



}