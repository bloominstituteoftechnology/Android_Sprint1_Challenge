package com.example.patrickjmartin.android_sprint1_challenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.lambdaschool.movieslist.R;

public class AddDetails extends AppCompatActivity {


    public static final String EDIT_MOVIE_KEY = "edit_movie";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);

        EditText movieName = (EditText) findViewById(R.id.editText);


    }

    @Override
    protected void onResume() {
        super.onResume();

        Intent intent =  getIntent();

    }
}