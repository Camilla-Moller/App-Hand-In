package com.example.apphandin.ui.garbage;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GarbageRepository {
    private static GarbageRepository instance;
    private DatabaseReference myRef;
    private GarbageLiveData name;
    private GarbageLiveData address;
    private GarbageLiveData city;
    private GarbageLiveData itemDescription;

    private GarbageRepository(){}

    public static synchronized GarbageRepository getInstance() {
        if(instance == null)
            instance = new GarbageRepository();
        return instance;
    }

    public void init(String userId) {
        myRef = FirebaseDatabase.getInstance().getReference().child("Garbage collector").child(userId);
        name = new GarbageLiveData(myRef);
        address = new GarbageLiveData(myRef);
        city = new GarbageLiveData(myRef);
        itemDescription = new GarbageLiveData(myRef);
    }

    public void saveOrder(String name, String address, String city, String itemDescription) {
        myRef.setValue(new Garbage(name, address, city, itemDescription));
    }

}
