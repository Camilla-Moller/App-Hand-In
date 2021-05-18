package com.example.apphandin.ui.REUSE;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

public class ReuseViewModel extends ViewModel {

    private final ReuseRepository reuseRepository;

    public ReuseViewModel() {
      reuseRepository = ReuseRepository.getInstance();
    }

    public void saveReuse(String reuse) {
        reuseRepository.saveReuse(reuse);
    }
    public LiveData<Reuse> getReuse() {
        return reuseRepository.getReuse();
    }
}
