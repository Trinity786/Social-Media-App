package com.innovativetech.socialmedia.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.innovativetech.socialmedia.Model_Classes.Post_modelClass;
import com.innovativetech.socialmedia.R;

import java.util.ArrayList;

public class post_Adapters extends RecyclerView.Adapter<post_Adapters.viewHolder>{

    ArrayList<Post_modelClass>list;
    Context context;

    public post_Adapters(ArrayList<Post_modelClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.post_recyclerview,parent,false);

    return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        holder.postProfile.setImageResource(list.get(position).getPostProfile());
        holder.postImage.setImageResource(list.get(position).getPostImage());
        holder.save.setImageResource(list.get(position).getPostSave());
        holder.like.setText(list.get(position).getLike());
        holder.comments.setText(list.get(position).getComment());
        holder.share.setText(list.get(position).getShare());
        holder.userName.setText(list.get(position).getPostUsername());
        holder.about.setText(list.get(position).getPostAbout());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView postProfile,postImage,save;
        TextView userName,about,like,comments,share;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            postProfile = itemView.findViewById(R.id.post_Profile);
            postImage = itemView.findViewById(R.id.post_roundedRecycler);
            save = itemView.findViewById(R.id.post_save);
            about = itemView.findViewById(R.id.post_category);
            like = itemView.findViewById(R.id.like);
            comments = itemView.findViewById(R.id.comment);
            userName = itemView.findViewById(R.id.post_userName);
            share = itemView.findViewById(R.id.post_share);

        }
    }
}
