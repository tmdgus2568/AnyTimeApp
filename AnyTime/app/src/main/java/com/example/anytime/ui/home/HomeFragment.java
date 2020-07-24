package com.example.anytime.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.anytime.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    ArrayList<Item_home> listHotIssue;
    HotIssueAdapter adapterHotIssue;
    ListView listViewHotIssue;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });

        listViewHotIssue = root.findViewById(R.id.listViewHotIssue);
        listHotIssue = generateItemList();
        adapterHotIssue = new HotIssueAdapter(getContext(),listHotIssue);
        listViewHotIssue.setAdapter(adapterHotIssue);


        return root;
    }
    private ArrayList<Item_home> generateItemList(){
        ArrayList<Item_home> l = new ArrayList<>();
        l.add(new Item_home("제목1","이름1"));
        l.add(new Item_home("제목2","이름2"));
        l.add(new Item_home("제목3","이름3"));
        return l;
    }
}