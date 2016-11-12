package app.testapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import app.testapp.R;
import app.testapp.adapter.PickListAdapter;

public class PickListActivity extends FragmentActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private PickListAdapter adapter;
    private ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_list);
        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(this);
        list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("Pick Item " + i);
        }
        adapter = new PickListAdapter(this, list);
        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(this, PickListDetailActivity.class));
    }
}
