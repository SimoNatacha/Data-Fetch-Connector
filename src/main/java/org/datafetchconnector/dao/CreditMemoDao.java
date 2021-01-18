package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Account;
import org.datafetchconnector.entities.CreditMemo;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CreditMemoDao {
    Session session = Connection.getSessionFactory().openSession();

    public String insertNewCreditMemo(CreditMemo customer) {
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

        return "CreditMemo Information saved successfully: " ;
    }


}