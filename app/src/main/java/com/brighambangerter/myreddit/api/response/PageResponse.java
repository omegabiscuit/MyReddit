package com.brighambangerter.myreddit.api.response;

/**
 * Created by Brigham on 1/22/2017.
 */


import com.brighambangerter.myreddit.api.model.Post;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class PageResponse {
    private String kind;
    private Post data;

    public String getKind() {return kind;}
    public Post getData(){return data;}

}
