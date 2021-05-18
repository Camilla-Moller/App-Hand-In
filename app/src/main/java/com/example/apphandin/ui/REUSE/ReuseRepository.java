package com.example.apphandin.ui.REUSE;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ReuseRepository {
    private static ReuseRepository instance;
    private DatabaseReference myRef;
    private ReuseLiveData reuse;

    private ReuseRepository(){}

    public static synchronized ReuseRepository getInstance() {
        if(instance == null)
            instance = new ReuseRepository();
        return instance;
    }

    public void init(String userId) {
        myRef = FirebaseDatabase.getInstance().getReference().child("users").child(userId);
        reuse = new ReuseLiveData(myRef);
    }

    public void saveReuse(String reuse) {
        myRef.setValue(new Reuse(reuse));
    }

    public ReuseLiveData getReuse() {
        return reuse;
    }
}
