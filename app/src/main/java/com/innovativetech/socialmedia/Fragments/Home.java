package com.innovativetech.socialmedia.Fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.innovativetech.socialmedia.Adapters.Story_Adapters;
import com.innovativetech.socialmedia.Adapters.post_Adapters;
import com.innovativetech.socialmedia.Model_Classes.Post_modelClass;
import com.innovativetech.socialmedia.Model_Classes.Story_model_class;
import com.innovativetech.socialmedia.R;

import java.util.ArrayList;

import static com.innovativetech.socialmedia.R.layout.fragment_home;

public class Home extends Fragment {

    public Home() {
        // Required empty public constructor
    }

    ArrayList<Story_model_class>list;
    Story_Adapters adapter;
    RecyclerView storyRecyclerView;

    // -------- For Post Design Layout hooks-------//

    ArrayList<Post_modelClass>postList;
    post_Adapters post_adapters;
    RecyclerView postRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        storyRecyclerView = view.findViewById(R.id.Story_recyclerView);

        list = new ArrayList<>();

        adapter = new Story_Adapters(list,getContext());

        list.add(new Story_model_class(R.drawable.cod_bg,R.drawable.greeen,R.drawable.live,"Rahul Singh"));
        list.add(new Story_model_class(R.drawable.cod_bg,R.drawable.apex_legends,R.drawable.live,"Saurav Saini"));
        list.add(new Story_model_class(R.drawable.cod_bg,R.drawable.fifa,R.drawable.live,"Rajan kaur"));
        list.add(new Story_model_class(R.drawable.cod_bg,R.drawable.power,R.drawable.live," Safal Singh"));
        list.add(new Story_model_class(R.drawable.cod_bg,R.drawable.user_bg,R.drawable.live,"Goku san"));
        list.add(new Story_model_class(R.drawable.cod_bg,R.drawable.greeen,R.drawable.live,"Vegeta sama"));


        storyRecyclerView.setAdapter(adapter);
        storyRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));

        //---- hooks --//


        postRecyclerView = view.findViewById(R.id.post_RecyclerView);

        postList = new ArrayList<>();

        post_adapters = new post_Adapters(postList,getContext());


        postList.add(new Post_modelClass(R.drawable.cod_bg,R.drawable.fifa,R.drawable.save,
                "Saurav Saini","Gamer/Music Lover","250"
                ,"325","100"));

        postList.add(new Post_modelClass(R.drawable.greeen,R.drawable.user_bg,R.drawable.bookmark,
                "Rahul singh"," PhotoGrapher","280"
                ,"35","100"));

        postList.add(new Post_modelClass(R.drawable.user_bg,R.drawable.cod_bg,R.drawable.save,
                "Saurav Saini","Gamer/Music Lover","250"
                ,"325","100"));

        postList.add(new Post_modelClass(R.drawable.cod_bg,R.drawable.user_bg,R.drawable.save,
                "Saurav Saini","Gamer/Music Lover","250"
                ,"325","100"));

        postList.add(new Post_modelClass(R.drawable.cod_bg,R.drawable.download,R.drawable.save,
                "Saurav Saini","Gamer/Music Lover","250"
                ,"325","100"));

        postList.add(new Post_modelClass(R.drawable.cod_bg,R.drawable.apex_legends,R.drawable.save,
                "Saurav Saini","Gamer/Music Lover","250"
                ,"325","100"));

        postList.add(new Post_modelClass(R.drawable.cod_bg,R.drawable.cod_bg,R.drawable.save,
                "Saurav Saini","Gamer/Music Lover","250"
                ,"325","100"));

        postList.add(new Post_modelClass(R.drawable.cod_bg,R.drawable.fifa,R.drawable.save,
                "Saurav Saini","Gamer/Music Lover","250"
                ,"325","100"));



        postRecyclerView.setAdapter(post_adapters);
        postRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));


        return  view;
    }

}

