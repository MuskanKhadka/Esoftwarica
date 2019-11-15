package com.muskan.esoftwarica.ui.dashboard;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.muskan.esoftwarica.model.StudentSet;

import java.util.ArrayList;
import java.util.List;

public class DashboardViewModel extends ViewModel {


    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}