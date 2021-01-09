package org.datafetchconnector.dao;

import com.intuit.oauth2.client.OAuth2PlatformClient;
import com.intuit.oauth2.config.Environment;
import com.intuit.oauth2.config.OAuth2Config;
import com.intuit.oauth2.data.BearerTokenResponse;
import com.intuit.oauth2.exception.OAuthException;
import org.datafetchconnector.Connection;
import org.datafetchconnector.constants.Constants;
import org.datafetchconnector.entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.ParseException;


public class UserDao {

    Session session = Connection.getSessionFactory().openSession();

    public String insertNewUser(User user) {
        Transaction tx = session.beginTransaction();
        try {
             session.save(user);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            session.close();
        }

        return "User Information saved successfully with id" ;
    }


    public User readUser(Integer id) {
        User user;
        Transaction tx = session.beginTransaction();
        user = session.get(User.class, id);

        tx.commit();
        return user;
    }

    public static User UpdateUser( Integer id, String code, String realmid, String state) {

        Session session = Connection.sessionFactory.openSession();

            try {
                Transaction txn = session.beginTransaction();
                User user = session.get(User.class, id);
                OAuth2Config oauth2Config = new OAuth2Config.OAuth2ConfigBuilder(Constants.clientID,Constants.clientSecret)
                        .callDiscoveryAPI(Environment.SANDBOX)
                        .buildConfig();

                //prepare OAuth2Platform client
                OAuth2PlatformClient client  = new OAuth2PlatformClient(oauth2Config);
                BearerTokenResponse bearerTokenResponse = client.retrieveBearerTokens(code, Constants.redirectUri);
                user.setRealmId(realmid);
                user.setCode(code);
                user.setConnected_date();
                user.setAccesToken(bearerTokenResponse.getAccessToken());
                user.setState(state);
                user.setRefresh_token(bearerTokenResponse.getRefreshToken());


                session.saveOrUpdate("User",user);
                txn.commit();

                return user;
            } catch (OAuthException | ParseException e) {
                e.printStackTrace();
            } finally {
                session.close();
            }




        return null;
    }}

//    public User tokenUpdate(Map<String, Object> data)   {
//
//        Session session = Constants.sessionFactory.openSession();
//
//
//
//        User user = session.get(User.class, (Integer) data.get("Id"));
//
//        if (user != null) {
//
//            try {
//                Transaction txn = session.beginTransaction();
//                user.setToken((String) data.get("token"));
//                user.setRefreshToken((String) data.get("refreshToken"));
//
//
//                session.saveOrUpdate(user);
//                txn.commit();
//                return user;
//
//            } finally {
//                session.close();
//            }
//        }
//
//        return null;
//    }}
