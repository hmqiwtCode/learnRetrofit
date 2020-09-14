package com.quy.learnretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPosts();
    // Neu endpoint https://jsonplaceholder.typicode.com/posts?userId=1 ->
    //@GET("posts")
    // Call<List<Post>> getPosts(@Query("userId") int userID);

    // Neu co nhieu param
    //@GET("posts")
    //  Call<List<Post>> getPosts(@Query("userId") int userID, @Query("_sort") String id);

    // Neu co nhieu userId can lay
    //@GET("posts")
    //  Call<List<Post>> getPosts(@Query("userId") Integer[] userId, @Query("_sort") String id);
    // Call<List<Post>> getPosts(@Query("userId") List<Integer> userId, @Query("_sort") String id);

    // Neu muon de null de request All
    //@GET("posts")
    //  Call<List<Post>> getPosts(@Query("userId") Integer userId, @Query("_sort") String id);


    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
