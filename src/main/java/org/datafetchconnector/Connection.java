package org.datafetchconnector;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Connection {
    public static SessionFactory sessionFactory = null;

    protected static void setUp() throws Exception{
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        try {

            sessionFactory = new MetadataSources(
                    registry
            ).buildMetadata().buildSessionFactory();
        }
        catch (Exception e){
            StandardServiceRegistryBuilder.destroy(registry);
            throw new RuntimeException(e);
        }

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //    SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
//    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

}