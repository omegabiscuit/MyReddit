package com.brighambangerter.myreddit;

/**
 * Created by Brigham on 1/29/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.brighambangerter.myreddit.R;

public class PostViewHolder extends RecyclerView.ViewHolder {
    protected TextView url;
    protected TextView title;
    protected ImageView thumbnail;
    protected RelativeLayout relativeLayout;

    public PostViewHolder(View view){
        super(view);
        this.thumbnail = (ImageView) view.findViewById(R.id.network_image);
        this.title = (TextView) view.findViewById(R.id.title);
        this.url = (TextView) view.findViewById(R.id.url);
        this.relativeLayout = (RelativeLayout) view.findViewById(R.id.relLayout);
        view.setClickable(true);

    }
}
