package app.testapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        Toast.makeText(this, "Selected Item: " + position, Toast.LENGTH_SHORT).show();
    }
}
