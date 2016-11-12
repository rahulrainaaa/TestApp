package app.testapp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.testapp.R;

/**
 * @class LocationActivity
 * @desc Show location of item in rack positions.
 */
public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }
}
