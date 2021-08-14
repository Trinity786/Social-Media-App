package com.innovativetech.socialmedia;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.innovativetech.socialmedia.Fragments.Home;
import com.innovativetech.socialmedia.Fragments.Notify;
import com.innovativetech.socialmedia.Fragments.Post;
import com.innovativetech.socialmedia.Fragments.Profile;
import com.innovativetech.socialmedia.Fragments.Search;
import com.innovativetech.socialmedia.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new Home());
        transaction.commit();


        binding.bottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch (i) {

                    case 0:

                        transaction.replace(R.id.frame_layout, new Home());

                        break;

                    case 1:
                        transaction.replace(R.id.frame_layout, new Search());
                        break;

                    case 2:

                        transaction.replace(R.id.frame_layout, new Post());
                        break;

                    case 3:

                        transaction.replace(R.id.frame_layout, new Notify());
                        break;

                    case 4:

                        transaction.replace(R.id.frame_layout, new Profile());
                        break;

                }
                transaction.commit();
            }
        });




    }
}