package com.innovativetech.socialmedia.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.innovativetech.socialmedia.Model_Classes.Story_model_class;
import com.innovativetech.socialmedia.R;

import java.util.ArrayList;

public class Story_Adapters extends RecyclerView.Adapter<Story_Adapters.viewHolder> {
    ArrayList<Story_model_class> list;
    Context context;

    public Story_Adapters(ArrayList<Story_model_class> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_recyclerview, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.userName.setText(list.get(position).getUserName());
        holder.roundedImage.setImageResource(list.get(position).getRoundedImage());
        holder.profileImage.setImageResource(list.get(position).getProfileImage());
        holder.storyType.setImageResource(list.get(position).getStoryType());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView roundedImage, profileImage, storyType;
        TextView userName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImage = itemView.findViewById(R.id.roundedRecycler);
            profileImage = itemView.findViewById(R.id.user_Profile);
            storyType = itemView.findViewById(R.id.Story_type);
            userName = itemView.findViewById(R.id.Recycler_userName);
        }
    }
}

