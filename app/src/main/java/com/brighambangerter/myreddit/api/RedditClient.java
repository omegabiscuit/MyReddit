package com.brighambangerter.myreddit.api;

import com.brighambangerter.myreddit.api.response.PageResponse;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Brigham on 1/22/2017.
 */

public class RedditClient {
    private static final String API_URL = "http://reddit.com/";

    private static Reddit sReddit;

    public interface Reddit{
        @GET(".json")
        Call<PageResponse>  getPage();
    }

    public static Reddit instance(){
        if(sReddit == null) {
            OkHttpClient client = new OkHttpClient();
            Retrofit restAdapter = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
            sReddit = restAdapter.create(Reddit.class);
        }
        return sReddit;
    }
}
