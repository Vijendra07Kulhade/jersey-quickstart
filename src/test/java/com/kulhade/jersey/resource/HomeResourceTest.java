package com.kulhade.jersey.resource;


import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

public class HomeResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        Application application =  new ResourceConfig(HomeResource.class);
//        System.out.println(application.getProperties().values());
        return application;
    }

    @Test
    public void testRequest(){
        Response response = target("/home").request().get();
        assertEquals("Http Response should be 200: ", javax.ws.rs.core.Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals("Http Content-Type should be: ", MediaType.APPLICATION_JSON, response.getHeaderString(HttpHeaders.CONTENT_TYPE));
    }

}
