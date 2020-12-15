package org.datafetchconnector;

import com.intuit.oauth2.client.OAuth2PlatformClient;
import com.intuit.oauth2.config.Environment;
import com.intuit.oauth2.config.OAuth2Config;
import com.intuit.oauth2.config.Scope;
import com.intuit.oauth2.data.BearerTokenResponse;
import com.intuit.oauth2.exception.InvalidRequestException;
import com.intuit.oauth2.exception.OAuthException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthConfig {

    public static String getUrl() throws InvalidRequestException {
        //Preparing the config
        OAuth2Config oauth2Config = new OAuth2Config.OAuth2ConfigBuilder(ReadPropertyFile.getPropertyValue("clientID"), ReadPropertyFile.getPropertyValue("ClientSecret")).callDiscoveryAPI(Environment.SANDBOX).buildConfig();


//Generate the CSRF token
        String csrf = oauth2Config.generateCSRFToken();

//    Preparing Scopes
        List<Scope> scopes = new ArrayList<Scope>();

        scopes.add(Scope.Accounting);
//Get the authorization URL
        System.out.println("Getting Authorization URL........");
        String url = oauth2Config.prepareUrl(scopes, ReadPropertyFile.getPropertyValue("redirectUri"), csrf);
        System.out.println("Auth URL is : " + url);
        return url;
    }



}
