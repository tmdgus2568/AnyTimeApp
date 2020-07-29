package com.HSH.anytimeapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kennyc.bottomsheet.BottomSheetListener;
import com.kennyc.bottomsheet.BottomSheetMenuDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalendarFragment extends Fragment implements View.OnClickListener {


    ViewGroup viewGroup;

    @BindView(R.id.textView16)
    TextView txt1;
    @BindView(R.id.textView17)
    TextView txt2;
    @BindView(R.id.textView18)
    TextView txt3;
    @BindView(R.id.textView19)
    TextView txt4;
    @BindView(R.id.textView20)
    TextView txt5;
    @BindView(R.id.textView22)
    TextView txt6;
    @BindView(R.id.textView23)
    TextView txt7;
    @BindView(R.id.textView24)
    TextView txt8;
    @BindView(R.id.textView25)
    TextView txt9;
    @BindView(R.id.textView26)
    TextView txt10;
    @BindView(R.id.textView28)
    TextView txt11;
    @BindView(R.id.textView29)
    TextView txt12;
    @BindView(R.id.textView30)
    TextView txt13;
    @BindView(R.id.textView31)
    TextView txt14;
    @BindView(R.id.textView32)
    TextView txt15;
    @BindView(R.id.textView34)
    TextView txt16;
    @BindView(R.id.textView35)
    TextView txt17;
    @BindView(R.id.textView36)
    TextView txt18;
    @BindView(R.id.textView37)
    TextView txt19;
    @BindView(R.id.textView38)
    TextView txt20;
    @BindView(R.id.textView40)
    TextView txt21;
    @BindView(R.id.textView41)
    TextView txt22;
    @BindView(R.id.textView42)
    TextView txt23;
    @BindView(R.id.textView43)
    TextView txt24;
    @BindView(R.id.textView44)
    TextView txt25;
    @BindView(R.id.textView46)
    TextView txt26;
    @BindView(R.id.textView47)
    TextView txt27;
    @BindView(R.id.textView48)
    TextView txt28;
    @BindView(R.id.textView49)
    TextView txt29;
    @BindView(R.id.textView50)
    TextView txt30;
    @BindView(R.id.textView52)
    TextView txt31;
    @BindView(R.id.textView53)
    TextView txt32;
    @BindView(R.id.textView54)
    TextView txt33;
    @BindView(R.id.textView55)
    TextView txt34;
    @BindView(R.id.textView56)
    TextView txt35;

    BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_calendar, container, false);
        ButterKnife.bind(this, viewGroup);
        txt1.setOnClickListener(this);
        bottomSheetMenuDialogFragment = new BottomSheetMenuDialogFragment();

        return viewGroup;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView16:
                txt1.setBackgroundColor(Color.parseColor("#F2F5A9"));
                new BottomSheetMenuDialogFragment.Builder(getContext())
                        .setSheet(R.menu.bottom_sheet)
                        .setListener(new BottomSheetListener() {
                            @Override
                            public void onSheetShown(BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment, Object o) {

                            }

                            @Override
                            public void onSheetItemSelected(BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment, MenuItem menuItem, Object o) {

                            }

                            @Override
                            public void onSheetDismissed(BottomSheetMenuDialogFragment bottomSheetMenuDialogFragment, Object o, int i) {

                            }
                        })
                        .show(getFragmentManager());

                break;

        }

    }
}
