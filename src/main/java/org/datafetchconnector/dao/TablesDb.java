package org.datafetchconnector.dao;
import org.datafetchconnector.Connection;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TablesDb {

    public void saveObject(Object ob){
        Session session = Connection.getSessionFactory().openSession();

        try{
            Transaction txn = session.beginTransaction();
            System.out.println("Saving.........");
            session.saveOrUpdate(ob);
            System.out.println("Done Saving......");
            txn.commit();

        }finally {
            session.close();
        }
    }

}
