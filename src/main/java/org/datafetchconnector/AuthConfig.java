package org.datafetchconnector;

import com.intuit.oauth2.config.Environment;
import com.intuit.oauth2.config.OAuth2Config;
import com.intuit.oauth2.config.Scope;
import com.intuit.oauth2.exception.InvalidRequestException;
import org.datafetchconnector.constants.Constants;

import java.util.ArrayList;
import java.util.List;

public class AuthConfig {

    public static String generateUrl() throws InvalidRequestException {
        //Preparing the config
        OAuth2Config oauth2Config = new OAuth2Config.OAuth2ConfigBuilder(Constants.clientID, Constants.clientSecret).callDiscoveryAPI(Environment.SANDBOX).buildConfig();


//Generate the CSRF token
        String csrf = oauth2Config.generateCSRFToken();

//    Preparing Scopes
        List<Scope> scopes = new ArrayList<>();

        scopes.add(Scope.Accounting);
//Get the authorization URL
        System.out.println("Generating Authorization URL........");
        String url = oauth2Config.prepareUrl(scopes, Constants.redirectUri, csrf);
        ReadPropertyFile.setProperty("authorizationUrl", url);
        System.out.println("Authorization URL Generated........");
        System.out.println(url);
        return url;

    }


}
