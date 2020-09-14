package com.quy.learnretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.internal.EverythingIsNonNull;

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

    //Post request
    //public Post(int userId, String title, String body) id will be generated
    @POST("posts")
    Call<Post> createPost(@Body Post post); // object will be converted to json url or we have second way like below

    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(@Field("userId") int userId, @Field("title") String title, @Field("body") String body);
    //userId=23&title=Hello%20world..


    //PUT hoặc PATCH (PUT để sửa toàn bộ record, trong khi PATCH thường dùng trong trường hợp sửa 1 phần của record)
    //PUT is for checking if resource is exists then update , else create new resource
    //PATCH is always for update a resource

    @PUT("posts/{id}")
    Call<Post> putPost(@Path("id") int id, @Body Post post);

    @PATCH("posts/{id}")
    Call<Post> PatchPost(@Path("id") int id, @Body Post post);
}
