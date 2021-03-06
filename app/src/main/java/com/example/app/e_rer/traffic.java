package com.example.app.e_rer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class traffic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traffic);
    }

    public void report(View view) {
        EditText locationField = (EditText) findViewById(R.id.locationid);
        String location = locationField.getText().toString();


        String content = smsSummary(location);
        String number = "1";
        SmsManager smsManager = SmsManager.getDefault();
        Toast.makeText(getApplicationContext(), "Thank You for Reporting, Dispatch Team will be sent Immediately", Toast.LENGTH_LONG).show();
        smsManager.sendTextMessage(number, null, content, null, null);
        Intent close = new Intent(this, MainActivity.class);
        startActivity(close);


    }

    private String smsSummary(String location) {
        String content = "There is a traffic congestion at " + location;
        return content;

    }
}
