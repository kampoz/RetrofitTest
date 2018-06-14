package com.example.programmer.retrofittest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Kamil on 2018-06-14.
 */
public interface PostApi {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts/1")
    Call<Post> getPost1();
}
