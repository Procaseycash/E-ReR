package com.example.app.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(toolbar);

    }

    public void police(View view) {
        Intent polIntent = new Intent(this, police.class);
        startActivity(polIntent);
    }

    public void fire(View view) {
        Intent firIntent = new Intent(this, fire.class);
        startActivity(firIntent);
    }

    public void ambulance(View view) {
        Intent ambIntent = new Intent(this, ambulance.class);
        startActivity(ambIntent);
    }

    public void roadSafety(View view) {
        Intent frscIntent = new Intent(this, frsc.class);
        startActivity(frscIntent);
    }

    public void nema(View view) {
        Intent nemaIntent = new Intent(this, nema.class);
        startActivity(nemaIntent);
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
            // Code you want run when activity is clicked
            Intent mintent = new Intent(this, about.class);
            startActivity(mintent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
