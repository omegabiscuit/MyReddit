package com.brighambangerter.myreddit.api.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Brigham on 1/29/2017.
 */

public class Source {
    private String url;
    private int width;
    private int height;

    public String getUrl(){return url;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
}
