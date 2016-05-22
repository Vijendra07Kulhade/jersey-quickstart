package com.kulhade.jersey;

import com.kulhade.jersey.response.User;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by vkulhade on 5/20/2016.
 */
@Path("home")
public class HomeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getHome() {
        User user = new User();
        user.setName("Vijendra");
        return user;
    }
}
