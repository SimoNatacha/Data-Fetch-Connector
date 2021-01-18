package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Account;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AccountDao {


    Session session = Connection.getSessionFactory().openSession();

    public String insertNewAccount(Account account) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(account);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Account Information saved successfully: " ;
    }




}