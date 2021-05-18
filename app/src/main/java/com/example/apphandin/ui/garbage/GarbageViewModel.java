package com.example.apphandin.ui.garbage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;


public class GarbageViewModel extends ViewModel {

    private final GarbageRepository garbageRepository;

    public GarbageViewModel() {
        garbageRepository = GarbageRepository.getInstance();
    }

    public void saveMessage(String message) {
        garbageRepository.saveMessage(message);
    }

    public LiveData<Garbage> getMessage() {
        return garbageRepository.getMessage();
    }

}
