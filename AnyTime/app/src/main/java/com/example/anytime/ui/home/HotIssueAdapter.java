package com.example.anytime.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.anytime.R;

import java.util.ArrayList;

public class HotIssueAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item_home> items;

    public HotIssueAdapter(Context context, ArrayList<Item_home> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_home,parent,false);
        }

        Item_home currentItem = (Item_home) getItem(position);
        TextView textViewItemName = (TextView) convertView.findViewById(R.id.title);
        TextView textViewItemNumber = (TextView) convertView.findViewById(R.id.name);

        textViewItemName.setText(currentItem.getItemName());
        textViewItemNumber.setText(currentItem.getItemNumber());

        return convertView;
    }
}
