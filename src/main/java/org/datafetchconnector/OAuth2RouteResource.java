package org.datafetchconnector;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.intuit.ipp.data.CompanyInfo;
import com.intuit.ipp.services.QueryResult;
import com.intuit.oauth2.client.DiscoveryAPIClient;
import com.intuit.oauth2.client.OAuth2PlatformClient;
import com.intuit.oauth2.config.Environment;
import com.intuit.oauth2.config.OAuth2Config;
import com.intuit.oauth2.data.BearerTokenResponse;
import com.intuit.oauth2.data.DiscoveryAPIResponse;
import com.intuit.oauth2.exception.ConnectionException;
import com.intuit.oauth2.exception.InvalidRequestException;
import com.intuit.oauth2.exception.OAuthException;
import org.datafetchconnector.helper.QBOServiceHelper;
import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
import org.apache.log4j.Logger;

@Path("oauth2redirect1")
public class OAuth2RouteResource {


    private static ReadPropertyFile factory;



    public static QBOServiceHelper helper;


    private static final Logger logger = Logger.getLogger(OAuth2RouteResource.class);
    private static final String failureMsg="Failed";


    @Path("returnsAuthURL")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_ATOM_XML})
    @GET
    public String Url() throws InvalidRequestException {
        return AuthConfig.getUrl();
    }
    private static String processResponse(String failureMsg, QueryResult queryResult) {
        if (!queryResult.getEntities().isEmpty() && queryResult.getEntities().size() > 0) {
            CompanyInfo companyInfo = (CompanyInfo) queryResult.getEntities().get(0);
            logger.info("Companyinfo -> CompanyName: " + companyInfo.getCompanyName());
            ObjectMapper mapper = new ObjectMapper();
            try {
                String jsonInString = mapper.writeValueAsString(companyInfo);
                return jsonInString;
            } catch (JsonProcessingException e) {
                logger.error("Exception while getting company info ", e);
                return new JSONObject().put("response",failureMsg).toString();
            }

        }
        return failureMsg;

    }

    @Path("oauth2redirect")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
    @GET
    public static List<String> getQueryParams(@QueryParam(value = "code") String code,
                                              @QueryParam(value = "state") String state,
                                              @QueryParam(value = "realmId") String realmId)
            throws OAuthException, ConnectionException {

//        List<String> strings = Arrays.asList(code, state, realmId);
        //Preparing the config
        OAuth2Config oauth2Config = new OAuth2Config.OAuth2ConfigBuilder(ReadPropertyFile.getPropertyValue("clientID"), ReadPropertyFile.getPropertyValue("clientSecret")).callDiscoveryAPI(Environment.SANDBOX).buildConfig();

        OAuth2PlatformClient client = new OAuth2PlatformClient(oauth2Config);


        //Get the bearer token (OAuth2 tokens)
        BearerTokenResponse bearerTokenResponse = client.retrieveBearerTokens(code, ReadPropertyFile.getPropertyValue("redirectUri"));

        //retrieve the token using the variables below
        bearerTokenResponse.getAccessToken();
        bearerTokenResponse.getRefreshToken();

        List<String> tokens = Arrays.asList(bearerTokenResponse.getAccessToken(), bearerTokenResponse.getRefreshToken(), realmId);
        //Call refresh endpoint
        DiscoveryAPIResponse discoveryAPIResponse = new DiscoveryAPIClient().callDiscoveryAPI(Environment.SANDBOX);
        BearerTokenResponse bearerTokenResponse1 = client.refreshToken(  bearerTokenResponse.getRefreshToken());
        System.out.println("The discoveryAPIResponse are: " + discoveryAPIResponse);
        return (tokens) ;

    }



//    @Path("/getCompanyInfo")
//    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON})
//    @GET
//    public void  callQBOCompanyInfo() {
//        try {
//
//            Client client = Client.create();
//
//            WebResource webResource = client
//                    .resource("http://localhost:8080/myapp/oauth2redirect1/oauth2redirect");
//
//            ClientResponse response = webResource.accept("application/json")
//                    .get(ClientResponse.class);
//
//            if (response.getStatus() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//                        + response.getStatus());
//            }
//
//            String output = response.getEntity(String.class);
//
//            System.out.println("Output from Server .... \n");
//            System.out.println(output);
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//
//    }
////
//
//        String realmId = (String)session.getAttribute("realmId");
//        if (StringUtils.isEmpty(realmId)) {
//            return new JSONObject().put("response","No realm ID.  QBO calls only work if the accounting scope was passed!").toString();
//        }
//        String accessToken = (String)session.getAttribute("access_token");
//
//        try {
//
//
//            //get DataService
//            DataService service = helper.getDataService(realmId, accessToken);
//
//            // get all companyinfo
//            String sql = "select * from companyinfo";
//            QueryResult queryResult = service.executeQuery(sql);
//            return processResponse(failureMsg, queryResult);
//
//        }
//        /*
//         * Handle 401 status code -
//         * If a 401 response is received, refresh tokens should be used to get a new access token,
//         * and the API call should be tried again.
//         */
//        catch (InvalidTokenException e) {
//            logger.error("Error while calling executeQuery :: " + e.getMessage());
//
//            //refresh tokens
//            logger.info("received 401 during companyinfo call, refreshing tokens now");
//            OAuth2PlatformClient client  = factory.getOAuth2PlatformClient();
//            String refreshToken = (String)session.getAttribute("refresh_token");
//
//            try {
//                BearerTokenResponse bearerTokenResponse = client.refreshToken(refreshToken);
//                session.setAttribute("access_token", bearerTokenResponse.getAccessToken());
//                session.setAttribute("refresh_token", bearerTokenResponse.getRefreshToken());
//
//                //call company info again using new tokens
//                logger.info("calling companyinfo using new tokens");
//                DataService service = helper.getDataService(realmId, accessToken);
//
//                // get all companyinfo
//                String sql = "select * from companyinfo";
//                QueryResult queryResult = service.executeQuery(sql);
//                return processResponse(failureMsg, queryResult);
//
//            } catch (OAuthException e1) {
//                logger.error("Error while calling bearer token :: " + e.getMessage());
//                return new JSONObject().put("response",failureMsg).toString();
//            } catch (FMSException e1) {
//                logger.error("Error while calling company currency :: " + e.getMessage());
//                return new JSONObject().put("response",failureMsg).toString();
//            }
//
//        } catch (FMSException e) {
//            List<Error> list = e.getErrorList();
//            list.forEach(error -> logger.error("Error while calling executeQuery :: " + error.getMessage()));
//            return new JSONObject().put("response",failureMsg).toString();
//        }
//
//    }
//
//    private String processResponse(String failureMsg, QueryResult queryResult) {
//        if (!queryResult.getEntities().isEmpty() && queryResult.getEntities().size() > 0) {
//            CompanyInfo companyInfo = (CompanyInfo) queryResult.getEntities().get(0);
//            logger.info("Companyinfo -> CompanyName: " + companyInfo.getCompanyName());
//            ObjectMapper mapper = new ObjectMapper();
//            try {
//                String jsonInString = mapper.writeValueAsString(companyInfo);
//                return jsonInString;
//            } catch (JsonProcessingException e) {
//                logger.error("Exception while getting company info ", e);
//                return new JSONObject().put("response",failureMsg).toString();
//            }
//
//        }
//        return failureMsg;
//    }

}
