package com.example.user.vitals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


/**
 * Created by Matt Goerwell on 09/12/2016.
 * This activity takes the information passed in to generate the appropriate
 * acceptable vital stats for each age range.
 */
public class DisplayActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Bundle extras = getIntent().getExtras();

        final TextView ageText    = (TextView) findViewById(R.id.age);
        final TextView weightText = (TextView) findViewById(R.id.weightText);
        final TextView heartText  = (TextView) findViewById(R.id.heartRate);
        final TextView lungText   = (TextView) findViewById(R.id.respRate);
        final TextView sysText    = (TextView) findViewById(R.id.systoBP);


        if (extras != null) {
            String age = extras.getString("age");
            ageText.setText(age);

            String weight = extras.getString("weight");
            weightText.setText(weight);

            String heartRate = extras.getString("heartRate");
            heartText.setText(heartRate);

            String lungRate = extras.getString("lungRate");
            lungText.setText(lungRate);

            String systo = extras.getString("systo");
            sysText.setText(systo);
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
