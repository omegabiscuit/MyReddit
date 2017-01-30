package com.brighambangerter.myreddit.api.model;

import java.util.ArrayList;

/**
 * Created by Brigham on 1/29/2017.
 */

public class Post {
    private String modhash;
    private ArrayList<Article> children;

    public String getModhash(){return modhash;}
    public ArrayList<Article> getChildren(){return children;}
}
