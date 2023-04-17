package org.example;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URI;

public  class demostepdef {

    private Scenario scenario;
    private final String BASE_URL = "http://localhost:300";

    @Before
    public  void before(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("Get all post {String}");
    public void getAllPosts(String url){
        RestAssured.baseURI = BASE_URL;
        RequestSpecification requestSpecification = RestAssured.given();
        Response response = requestSpecification.when().get(new URI(url));

    }
}