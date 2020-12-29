package org.datafetchconnector.dao;

import org.datafetchconnector.Connection;
import org.datafetchconnector.entities.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDao {
    Session session = Connection.getSessionFactory().openSession();

    public String insertNewEmployee(Employee employee) {
        Transaction tx = session.beginTransaction();

        try {
            session.save(employee);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "Employee Information saved successfully: " ;
    }



}