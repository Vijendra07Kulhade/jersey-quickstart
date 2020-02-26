package com.kulhade.jersey.resource;

import com.kulhade.jersey.response.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by vkulhade on 5/20/2016.
 */

@Component
@Path("/home")
public class HomeResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getHome() {
        User user = new User();
        user.setName("Vijendra");
        return user;
    }
}
