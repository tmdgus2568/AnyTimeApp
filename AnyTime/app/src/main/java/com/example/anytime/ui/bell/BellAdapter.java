package com.example.anytime.ui.bell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.anytime.R;

import java.util.ArrayList;

public class BellAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item_bell> items;

    public BellAdapter(Context context, ArrayList<Item_bell> items){
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_bell,parent,false);
        }

        Item_bell currentItem = (Item_bell) getItem(position);
        TextView textViewItemTitle = (TextView) convertView.findViewById(R.id.title);

        textViewItemTitle.setText(currentItem.getItemTitle());

        return convertView;
    }
}