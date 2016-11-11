package app.testapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import app.testapp.R;
import app.testapp.adapter.ActivityListAdapter;

/**
 * @class HomePageActivity
 * @desc Activity Class to show list of all categories.
 */
public class HomePageActivity extends FragmentActivity implements View.OnClickListener {

    private TextView txtTargetRate, txtCurrentRate;
    private ListView listView;
    public ArrayList<String> list;
    private ActivityListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home_page);

        txtCurrentRate = (TextView) findViewById(R.id.txt_current_rate);
        txtTargetRate = (TextView) findViewById(R.id.txt_target_rate);
        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();
        for (int i = 0; i < 40; i++) {
            list.add("item " + i);
        }
        adapter = new ActivityListAdapter(this, list);
        listView.setAdapter(adapter);

        txtTargetRate.setOnClickListener(this);
        txtCurrentRate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_current_rate:
                Toast.makeText(this, "Current Rate", Toast.LENGTH_SHORT).show();
                PopupMenu popup = new PopupMenu(this, this.getCurrentFocus());
                popup.getMenuInflater().inflate(R.menu.menu_home_page, popup.getMenu());
                popup.show();
                break;

            case R.id.txt_target_rate:
                Toast.makeText(this, "Target Rate", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, SummaryActivity.class));
                break;

            default:
                Toast.makeText(this, "Unhandeled OnClick Listener", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
