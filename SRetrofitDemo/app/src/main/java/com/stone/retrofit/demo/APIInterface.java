package com.stone.retrofit.demo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by stone on 17-11-14.
 */

public interface APIInterface {

    @GET("/users/{user}")
    Call<TestModel> repo(@Path("user") String user);

}
