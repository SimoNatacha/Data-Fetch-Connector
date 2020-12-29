package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Budget;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class BudgetDao {


    Session session = Connection.getSessionFactory().openSession();

    public String insertNewBudget(Budget budget) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(budget);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Budget Information saved successfully: " ;
    }




}