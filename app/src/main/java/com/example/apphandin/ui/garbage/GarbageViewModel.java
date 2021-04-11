package com.example.apphandin.ui.garbage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GarbageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GarbageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is garbage collector fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
