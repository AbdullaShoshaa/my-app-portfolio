package com.example.shoshaa.myportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button spotify, scores, library, buildIt, xyzreader, finalApp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotify = (Button) findViewById(R.id.spotify_button);
        spotify.setOnClickListener(this);

        scores = (Button) findViewById(R.id.scores_button);
        scores.setOnClickListener(this);

        library = (Button) findViewById(R.id.library_button);
        library.setOnClickListener(this);

        buildIt = (Button) findViewById(R.id.build_it_button);
        buildIt.setOnClickListener(this);

        xyzreader = (Button) findViewById(R.id.reader_button);
        xyzreader.setOnClickListener(this);

        finalApp = (Button) findViewById(R.id.final_app_button);
        finalApp.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.spotify_button){
            makeToastMessage("Spotify Streamer");
        }else if(v.getId() == R.id.scores_button){
            makeToastMessage("Football Scores App");
        }else if(v.getId() == R.id.library_button){
            makeToastMessage("Library App");
        }else if (v.getId() == R.id.reader_button){
            makeToastMessage("XYZ Reader");
        }else if(v.getId() == R.id.build_it_button){
            makeToastMessage("Build It Bigger");
        }else if(v.getId() == R.id.final_app_button){
            makeToastMessage("Final App");
        }
    }

    private void makeToastMessage(String appName){
        Toast.makeText(getApplicationContext(),
                "This button will launch "+appName ,
                Toast.LENGTH_LONG).show();
    }
}
