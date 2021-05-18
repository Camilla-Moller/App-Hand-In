package com.example.apphandin.ui.garbage;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GarbageRepository {
    private static GarbageRepository instance;
    private DatabaseReference myRef;
    private GarbageLiveData message;

    private GarbageRepository(){}

    public static synchronized GarbageRepository getInstance() {
        if(instance == null)
            instance = new GarbageRepository();
        return instance;
    }

    public void init(String userId) {
        myRef = FirebaseDatabase.getInstance().getReference().child("users").child(userId);
        message = new GarbageLiveData(myRef);
    }

    public void saveMessage(String message) {
        myRef.setValue(new Garbage(message));
    }

    public GarbageLiveData getMessage() {
        return message;
    }
}
