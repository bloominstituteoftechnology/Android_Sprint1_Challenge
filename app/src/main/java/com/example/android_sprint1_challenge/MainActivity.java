package com.example.android_sprint1_challenge;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.android_sprint1_challenge.MovieEntry.*;

class MainActivity extends AppCompatActivity {

    public static int nextId = 0;

    private Button addMovieButton;
    private EditText entry;
    Context context;


    private Button saveMovie;
    private ArrayList<String> addArray = new ArrayList<String>();
    protected ListView showMovieList;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        //handler for button to goto page 2
        addMovieButton = (Button) findViewById(R.id.add_movie);
        addMovieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity2();
            }

        });


        for (String movieLoop : addArray) {
            ((LinearLayout) findViewById(R.id.listOfMovies)).addView(genTextView(movieLoop));

            entry = (EditText) findViewById(R.id.add_edit_movie);
            showMovieList  = (ListView) findViewById(R.id.listViewMovies);
            saveMovie = (Button) findViewById(R.id.save_button);
        }

    }

    //makes button clicable
    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    //generate text view
    public TextView genTextView(String movies) {
        TextView view = new TextView(this);
        view.setText(movies);
        view.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
        return view;
    }

    //addmovie

    private void creatMovieEntry () {
        MovieEntry entry = new MovieEntry(nextId++);
    }



}

/*saveMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getMovieName = saveMovie.getText().toString();
                if (addArray).contains(getMovieName))(
                        Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG);
                        )
                else if (getMovieName == null || getMovieName.trim().equals("")) {
                    Toast.makeText(getBaseContext(), "", Toast.LENGTH_LONG);
                }
                else {
                    addArray.add(getMovieName);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, addArray );
                    showMovieList.setAdapter(adapter);
                    ((EditText)findViewById(R.id.add_edit_movie)).setText(" ");
                }
            }
        });*/