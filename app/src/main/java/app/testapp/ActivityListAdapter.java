package app.testapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * @class ActivityListAdapter
 * @desc Adapter Class for ActivityList.
 */

public class ActivityListAdapter extends ArrayAdapter<String> {

    private Activity activity;
    private ArrayList<String> list;
    private LayoutInflater inflater;

    public ActivityListAdapter(Activity activity, ArrayList<String> list) {
        super(activity, R.layout.list_activitylist, list);
        this.activity = activity;
        this.list = list;
        this.inflater = activity.getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_activitylist, null);
        }
        return view;
    }
}
