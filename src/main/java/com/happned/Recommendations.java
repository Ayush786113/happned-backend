package com.happned;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
@JsonIgnoreProperties(ignoreUnknown = true)
class Content{
    @JsonProperty("user")
    public _User user;
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Datum{
    public Content content;
}
@JsonIgnoreProperties(ignoreUnknown = true)
public class Recommendations{
    public int status;
    public ArrayList<Datum> data;
    public boolean success;
    public int error_code;
}
@JsonIgnoreProperties(ignoreUnknown = true)
class _User{
    public String id;
    public String first_name;
    public String about;
    public int age;
    public String gender;
    public ResidenceCity residence_city;
    public ArrayList<Profile> profiles;
    public Verification verification;
}

