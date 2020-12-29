package org.datafetchconnector.controller;

import com.intuit.oauth2.client.OAuth2PlatformClient;
import com.intuit.oauth2.config.Environment;
import com.intuit.oauth2.config.OAuth2Config;
import com.intuit.oauth2.data.BearerTokenResponse;
import com.intuit.oauth2.exception.OAuthException;
import org.codehaus.jettison.json.JSONException;
import org.datafetchconnector.constants.Constants;

import java.util.Arrays;
import java.util.List;

public class QBApiController {



    public static List<String> getBearerToken(String authcode) throws OAuthException, JSONException {
        //initialize the config
        OAuth2Config oauth2Config = new OAuth2Config.OAuth2ConfigBuilder(Constants.clientID,Constants.clientSecret)
                .callDiscoveryAPI(Environment.SANDBOX)
                .buildConfig();

        //prepare OAuth2Platform client
        OAuth2PlatformClient client  = new OAuth2PlatformClient(oauth2Config);
      
        BearerTokenResponse bearerTokenResponse = client.retrieveBearerTokens(authcode, Constants.redirectUri);

        List<String> tokens = Arrays.asList(bearerTokenResponse.getAccessToken(),  bearerTokenResponse.getAccessToken());



        return tokens;
            
    }
}
