package app.testapp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.testapp.R;

/**
 * @class ItemViewActivity
 * @desc View the image of item.
 */
public class ItemViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);
    }
}
