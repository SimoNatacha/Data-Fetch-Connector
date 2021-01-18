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

        String url = ReadPropertyFile.getProperty("base_uri") + "/v3/company";
        Config.setProperty(Config.BASE_URL_QBO, url);
        OAuth2Authorizer oauth = new OAuth2Authorizer(accessToken);
        //create context
        Context context = new Context(oauth, ServiceType.QBO, realmId);


        return new DataService(context);
    }
}