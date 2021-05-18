package com.example.apphandin;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.apphandin.ui.REUSE.ReuseRepository;
import com.example.apphandin.data.UserRepository;
import com.example.apphandin.ui.garbage.GarbageRepository;
import com.google.firebase.auth.FirebaseUser;

public class MainActivityViewModel extends AndroidViewModel {

    private final UserRepository userRepository;
    private final ReuseRepository reuseRepository;
    private final GarbageRepository garbageRepository;

    public MainActivityViewModel(Application app) {
        super(app);
        userRepository = UserRepository.getInstance(app);
        reuseRepository = ReuseRepository.getInstance();
        garbageRepository = GarbageRepository.getInstance();

    }
    public void init() {
        String userId = userRepository.getCurrentUser().getValue().getUid();
        reuseRepository.init(userId);
        garbageRepository.init(userId);

    }

    public LiveData<FirebaseUser> getCurrentUser(){
        return userRepository.getCurrentUser();
    }


    public void signOut() {
        userRepository.signOut();
    }

}
