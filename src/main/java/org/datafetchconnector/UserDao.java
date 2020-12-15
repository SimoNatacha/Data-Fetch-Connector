package org.datafetchconnector;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

    Session session = Connection.getSessionFactory().openSession();

    public String insertNewUser(User user){
        Transaction tx = session.beginTransaction();
        int userId = 0;
        try{
            userId = (Integer) session.save(user);
            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "User Information saved successfully with id" + userId;
    }

    public User readUser(Integer id){
        System.out.println("Step one");
        User user;
        System.out.println("Step two");
        Transaction tx = session.beginTransaction();
        System.out.println("Step three");
        user = session.get(User.class, id);
        return user;
    }
}
