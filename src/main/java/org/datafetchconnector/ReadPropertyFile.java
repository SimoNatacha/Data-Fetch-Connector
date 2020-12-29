package org.datafetchconnector;
import com.intuit.oauth2.client.OAuth2PlatformClient;
import com.intuit.oauth2.config.OAuth2Config;

import java.io.*;
import java.util.Properties;

public class ReadPropertyFile {
    private static InputStream input;
    private static OutputStream out;
    private static Properties prop;

    OAuth2Config oauth2Config;
    OAuth2PlatformClient client;

    public OAuth2PlatformClient getOAuth2PlatformClient() {


        return client;
    }

    public OAuth2Config getOAuth2Config() {

        return oauth2Config;
    }


    public static String getProperty(String property) {
        try {
            input = new FileInputStream("src/main/resources/application.properties");
            prop = new Properties();
            prop.load(input);

            return prop.getProperty(property);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void setProperty(String property, String value) {
        try {

            input = new FileInputStream("src/main/resources/application.properties");
            prop = new Properties();
            prop.load(input);
            input.close();

            out = new FileOutputStream("src/main/resources/application.properties");
            prop.setProperty(property, value);

            prop.store(out, null);
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
