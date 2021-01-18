package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Invoice;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InvoiceDao {
    Session session = Connection.getSessionFactory().openSession();

    public String insertNewInvoice(Invoice invoice) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(invoice);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Invoice Information saved successfully: " ;
    }



}