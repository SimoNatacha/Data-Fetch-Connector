package org.datafetchconnector.resources;

import com.google.gson.Gson;
import com.intuit.oauth2.exception.InvalidRequestException;
import org.datafetchconnector.AuthConfig;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("oauth2redirect1")
public class OAuth2RouteResource {

    @Path("/returnsAuthURL")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public static String getUrl() throws InvalidRequestException {
        return AuthConfig.generateUrl();
    }

    @Path("oauth2redirect")
    @Produces( MediaType.APPLICATION_JSON)
    @GET
    public static String getQueryParams(@QueryParam(value = "code") String code,
                                        @QueryParam(value = "state") String state,
                                        @QueryParam(value = "realmId") String realmId) {
        List<String> params = Arrays.asList(code, state, realmId);

        String json = new Gson().toJson(params );
        return json;

    }


}
