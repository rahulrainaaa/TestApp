package app.testapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

import app.testapp.R;

/**
 * @class PickListAdapter
 * @desc Adapter Class for Pick List.
 */

public class PickListAdapter extends ArrayAdapter<String> {

    private Activity activity;
    private ArrayList<String> list;
    private LayoutInflater inflater;

    public PickListAdapter(Activity activity, ArrayList<String> list) {
        super(activity, R.layout.list_picklist_item, list);
        this.activity = activity;
        this.list = list;
        this.inflater = activity.getLayoutInflater();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_picklist_item, null);
        }
        return view;
    }
}
