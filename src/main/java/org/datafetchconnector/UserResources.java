package org.datafetchconnector;


import com.intuit.oauth2.exception.InvalidRequestException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("user")
public class UserResources {

    @POST
    @Path("createUser")
    @Consumes(MediaType.APPLICATION_JSON)
    public String createUser(User user){
        try {
            String res = new UserDao().insertNewUser(user);
            return res;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "{}";
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("id") Integer id){
        System.out.println("getting User");

        try {
            System.out.println("In the try:id= "+ id);

            User user = new UserDao().readUser(id);
            return user;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public String test(){
        User user = new User();
        user.setAge(20);
        user.setId(1);
        user.setGender("female");
        user.setName("Simo");

        createUser(user);
        System.out.println("I am here");
        return "This is for Test";
    }

    @Path("anything")
    @Produces(MediaType.TEXT_PLAIN)
    @GET
    public String any(){
        return "anything";
    }



}
