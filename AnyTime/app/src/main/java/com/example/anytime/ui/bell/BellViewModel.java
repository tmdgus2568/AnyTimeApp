package com.example.anytime.ui.bell;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BellViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BellViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is bell fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
