package com.mobiquity.core.client;

import com.mobiquity.core.config.ConfigParser;
import com.mobiquity.utils.SpecificationFactory;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class RestClient {


    public RestClient() {
        RestAssured.baseURI = ConfigParser.getValue("BaseUrl");
    }

    public Response get(String endpoint) {
        return given().filter(new AllureRestAssured()).spec(SpecificationFactory.log_Response_To_Allure()).when().get(endpoint);
    }

    public Response getWithQueryParam(String endpoint, String key, Object value) {
        return given().filter(new AllureRestAssured()).queryParam(key,value).spec(SpecificationFactory.log_Response_To_Allure()).when().get(endpoint);
    }

    public Response post(String endpoint, Object body) {
        return given().filter(new AllureRestAssured()).contentType(ContentType.JSON).spec(SpecificationFactory.log_Response_To_Allure())
                .when().body(body).post(endpoint);
    }

    public Response put(String endpoint, Object body) {
        return given().filter(new AllureRestAssured()).contentType(ContentType.JSON).spec(SpecificationFactory.log_Response_To_Allure())
                .when().body(body).put(endpoint);
    }

    public Response patch(String endpoint, Object body) {
        return given().filter(new AllureRestAssured()).contentType(ContentType.JSON).spec(SpecificationFactory.log_Response_To_Allure())
                .when().body(body).patch(endpoint);
    }

    public Response delete(String endpoint) {
        return given().filter(new AllureRestAssured()).spec(SpecificationFactory.log_Response_To_Allure()).when().delete(endpoint);
    }
}
