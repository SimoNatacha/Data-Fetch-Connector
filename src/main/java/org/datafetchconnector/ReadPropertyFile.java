package org.datafetchconnector;

import com.intuit.oauth2.client.OAuth2PlatformClient;
import com.intuit.oauth2.config.OAuth2Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {
    private static InputStream input;
    private static Properties prop;

    OAuth2PlatformClient client;
    OAuth2Config oauth2Config;
    public static String getPropertyValue(String propertyName) {

        try {
            input = new FileInputStream("src/main/resources/application.properties");
            prop = new Properties();
            prop.load(input);

            return prop.getProperty(propertyName);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
return "";
    }

    public static void setProps() {
        try {
            input = new FileInputStream("src/main/resources/application.properties");
            prop = new Properties();
            prop.load(input);

            String OAuth2AppClientId = prop.getProperty("clientID");
            System.out.println(OAuth2AppClientId);

            String OAuth2AppClientSecret = prop.getProperty("clientSecret");
            System.out.println(OAuth2AppClientSecret);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public OAuth2PlatformClient getOAuth2PlatformClient()  {

        return client;
    }

    public OAuth2Config getOAuth2Config()  {
        return oauth2Config;
    }


}
