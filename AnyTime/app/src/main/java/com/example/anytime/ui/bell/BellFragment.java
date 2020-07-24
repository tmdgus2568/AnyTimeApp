package com.example.anytime.ui.bell;

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
import com.example.anytime.ui.list.Item_list;
import com.example.anytime.ui.list.ListAdapter;
import com.example.anytime.ui.list.ListViewModel;

import java.util.ArrayList;

public class BellFragment extends Fragment {

    private BellViewModel bellViewModel;
    ArrayList<Item_bell> listBell;
    BellAdapter adapterBell;
    ListView listViewBell;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bellViewModel =
                ViewModelProviders.of(this).get(BellViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bell, container, false);
//        final TextView textView = root.findViewById(R.id.text_bell);
        bellViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//                textView.setText(s);
            }
        });

        listViewBell = root.findViewById(R.id.listViewBell);
        listBell = generateItemList();
        adapterBell = new BellAdapter(getContext(),listBell);
        listViewBell.setAdapter(adapterBell);
        return root;
    }

    private ArrayList<Item_bell> generateItemList(){
        ArrayList<Item_bell> l = new ArrayList<>();
        l.add(new Item_bell("제목3"));
        l.add(new Item_bell("제목3"));
        l.add(new Item_bell("제목3"));
        l.add(new Item_bell("제목3"));
        l.add(new Item_bell("제목3"));
        l.add(new Item_bell("제목3"));
        l.add(new Item_bell("제목3"));
        l.add(new Item_bell("제목3"));
        return l;
    }
}