package org.datafetchconnector.helper;
import com.intuit.ipp.util.Config;
import com.intuit.ipp.core.Context;
import com.intuit.ipp.core.ServiceType;
import com.intuit.ipp.exception.FMSException;
import com.intuit.ipp.security.OAuth2Authorizer;
import com.intuit.ipp.services.DataService;
import org.datafetchconnector.ReadPropertyFile;

public class QBOServiceHelper {

    public static DataService getDataService(String realmId, String accessToken) throws FMSException {

        System.out.println("Hello Get Dataservice");

        String url = ReadPropertyFile.getProperty("base_uri") + "/v3/company";
        Config.setProperty(Config.BASE_URL_QBO, url);

        //create oauth object
        OAuth2Authorizer oauth = new OAuth2Authorizer(accessToken);
        System.out.println("OAUTH: " + oauth);
        //create context
        Context context = new Context(oauth, ServiceType.QBO, realmId);

        System.out.println("context: " + context);
        // create dataservice

        System.out.println("new DataService(context) :" + new DataService(context));
        return new DataService(context);
    }
}