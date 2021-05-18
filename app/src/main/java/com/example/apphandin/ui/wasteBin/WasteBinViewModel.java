package com.example.apphandin.ui.wasteBin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class WasteBinViewModel extends ViewModel {
    WasteBinRepository repository;

    public  WasteBinViewModel() {
        repository = WasteBinRepository.getInstance();
    }

    LiveData<WasteBin> getSearchedWasteBin() {
        return  repository.getSearchedWasteBin();
    }

    public void searchForWasteBin (String s) {
        repository.searchForWasteBin(s);
    }
}
