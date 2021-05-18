package com.example.apphandin.ui.tips;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class TipsViewModel extends AndroidViewModel {


    private final TipRepository repository;

    public TipsViewModel(Application app) {
        super(app);
        repository = TipRepository.getInstance(app);

    }

    public LiveData<List<Tip>> getAllTips() {
        return repository.getAllTips();
    }

    public void insert(final Tip tip) {
        repository.insert(tip);
    }

}
