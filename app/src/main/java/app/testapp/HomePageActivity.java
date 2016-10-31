package app.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtTargetRate, txtCurrentRate;
    private ListView listView;
    public ArrayList<String> list;
    private ActivityListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                break;

            case R.id.txt_target_rate:
                Toast.makeText(this, "Target Rate", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Unhandeled OnClick Listener", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
