package com.example.retrofit;

import com.example.retrofit.pojo.CreateUserRequest;
import com.example.retrofit.pojo.CreateUserResponse;
import com.example.retrofit.pojo.User;

import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Response;

import java.io.IOException;

public class RetrofitApplicationTests {

    APIInterface service = APIClientHelper.getClient().create(APIInterface.class);

    @Test(testName = "GET - GET USER BY ID")
    void checkGetUser() throws IOException {
        Response<User> response = service.getUser().execute();

        System.out.println(response.body());
        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(2,response.body().getData().getId());
        Assert.assertEquals("Janet", response.body().getData().getFirstName());
        Assert.assertEquals("Weaver", response.body().getData().getLastName());
    }


    @Test(testName = "POST - CREATE USER")
    void checkUserCreation() throws IOException {
        Response<CreateUserResponse> responseCreateUser = service.createUser(getRequestBody()).execute();
        System.out.println(getRequestBody());

        System.out.println(responseCreateUser.body());
        Assert.assertTrue(responseCreateUser.isSuccessful());
        Assert.assertEquals(201, responseCreateUser.code());
        Assert.assertEquals("morpheus", responseCreateUser.body().getName());
        Assert.assertEquals("leader", responseCreateUser.body().getJob());
    }

    public CreateUserRequest getRequestBody() {
        CreateUserRequest requestNewUserData = new CreateUserRequest();
        requestNewUserData.setJob("leader");
        requestNewUserData.setName("morpheus");

        return requestNewUserData;
    }


}
