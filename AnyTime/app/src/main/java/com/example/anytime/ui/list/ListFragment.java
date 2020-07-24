package com.example.anytime.ui.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.anytime.R;
import com.example.anytime.ui.list.ListAdapter;
import com.example.anytime.ui.list.Item_list;
import com.example.anytime.ui.list.Item_list;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private ListViewModel listViewModel;
    ArrayList<Item_list> listList;
    ListAdapter adapterList;
    ListView listViewList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        listViewModel =
                ViewModelProviders.of(this).get(ListViewModel.class);
        View root = inflater.inflate(R.layout.fragment_list, container, false);
//        final TextView textView = root.findViewById(R.id.text_list);
        listViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });

        listViewList = root.findViewById(R.id.listViewList);
        listList = generateItemList();
        adapterList = new ListAdapter(getContext(),listList);
        listViewList.setAdapter(adapterList);

        return root;
    }

    private ArrayList<Item_list> generateItemList(){
        ArrayList<Item_list> l = new ArrayList<>();
        l.add(new Item_list("제목3"));
        l.add(new Item_list("제목3"));
        l.add(new Item_list("제목3"));
        l.add(new Item_list("제목3"));
        l.add(new Item_list("제목3"));
        l.add(new Item_list("제목3"));
        l.add(new Item_list("제목3"));
        l.add(new Item_list("제목3"));
        return l;
    }
}