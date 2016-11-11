package app.testapp.adapter;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.ArrayList;

import app.testapp.R;

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
        LinearLayout linearLayout = (LinearLayout)view.findViewById(R.id.linearlayout);
        if (position % 4 == 0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_red));
            } else {
                //linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_green));
            }

        } else if (position % 4 == 1) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_green));
            } else {
                //linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_green));
            }
        } else if (position % 4 == 2) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_yellow));
            } else {
                //linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_green));
            }
        } else if (position % 4 == 3) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_gray));
            } else {
                //linearLayout.setBackground(activity.getDrawable(R.drawable.rect_border_green));
            }
        }
        return view;
    }
}
