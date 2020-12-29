package org.datafetchconnector.resources;


import org.datafetchconnector.dao.UserDao;
import org.datafetchconnector.entities.User;
import org.datafetchconnector.routes.Test;

import javax.json.JsonObject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
public class UserResources {


    @POST
    @Path("createUser")
    @Consumes
            (MediaType.APPLICATION_JSON)
    public String createUser(User user) {
        try {
            return new UserDao().insertNewUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "{}";
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    public User getUser(@PathParam("id") Integer id) {
        System.out.println("getting User");

        try {
            System.out.println("In the try:id= " + id);

            return new UserDao().readUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @POST
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    public static Object readSet(@PathParam("id") Integer id, JsonObject objectData)  {

          try {
              UserDao.UpdateUser(id, objectData.getString("code"),objectData.getString("realmId"),objectData.getString("state"));
              return "Successfull";
          }catch (Exception e){
              System.out.println("Exception");
              e.printStackTrace();
          }

        return "executed readSet" ;
    }
}
