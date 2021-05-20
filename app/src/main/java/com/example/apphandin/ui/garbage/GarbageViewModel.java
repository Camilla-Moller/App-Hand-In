package com.example.apphandin.ui.garbage;

import androidx.lifecycle.ViewModel;


public class GarbageViewModel extends ViewModel {

    private final GarbageRepository garbageRepository;

    public GarbageViewModel() {
        garbageRepository = GarbageRepository.getInstance();
    }

    public void saveOrder(String name, String address, String city, String itemDescription) {
        garbageRepository.saveOrder(name, address, city, itemDescription);
    }


}
