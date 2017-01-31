package com.brighambangerter.myreddit;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.brighambangerter.myreddit.api.model.Article;
import com.brighambangerter.myreddit.api.model.Post;
import com.brighambangerter.myreddit.api.model.Source;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by Brigham on 1/29/2017.
 */

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder>{

    private List<Article> mArticles;

    public PostAdapter() {
        mArticles = new ArrayList<>();
    }

    public void setArticles(ArrayList<Article> articles) {
        mArticles.clear();
        mArticles.addAll(articles);
        notifyDataSetChanged();
    }

    public PostViewHolder onCreateViewHolder(final ViewGroup viewGroup, int position) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, null);
        PostViewHolder holder = new PostViewHolder(v);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView articleUrl = (TextView) v.findViewById(R.id.url);
                String postUrl = articleUrl.getText().toString();
                //Intent intent = new Intent(mContext, webActivity.class);
                //intent.putExtra("url", postUrl);
                //mContext.startActivity(intent);
            }

        });

        return holder;
    }


    public void onBindViewHolder(final PostViewHolder postViewHolder, int position) {
        Article article = mArticles.get(position);
        Source image = article.getData().getImages().get(position);

        postViewHolder.getLayoutPosition();
        Picasso.with(postViewHolder.itemView.getContext())
                .load(image.getUrl())
                .placeholder(R.drawable.placeholder)
                .into(postViewHolder.thumbnail);

        postViewHolder.title.setText(Html.fromHtml(article.getData().getTitle()));
    }

    public void clearAdapter() {
        mArticles.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }
}
