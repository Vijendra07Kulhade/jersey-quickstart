package com.kulhade.jersey.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by vkulhade on 5/21/2016.
 */
@XmlRootElement(name = "user")
public class User implements Serializable{

    @XmlElement(name = "name")
    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
