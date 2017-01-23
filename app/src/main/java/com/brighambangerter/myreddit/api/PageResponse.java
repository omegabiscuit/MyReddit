package com.brighambangerter.myreddit.api;

/**
 * Created by Brigham on 1/22/2017.
 */


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class PageResponse {
    @SerializedName("kind")
    private String mkind;
    @SerializedName("children")
    private ArrayList<Post> mChildren;

    public String getKind() {return mkind;}

    public ArrayList<Post> getChildren() {return mChildren;}

}
