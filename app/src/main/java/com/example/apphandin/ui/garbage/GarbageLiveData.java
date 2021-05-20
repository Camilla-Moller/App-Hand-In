package com.example.apphandin.ui.garbage;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

public class GarbageLiveData extends LiveData<Garbage> {
    private final ValueEventListener listener = new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            Garbage name = snapshot.getValue(Garbage.class);
            setValue(name);
            Garbage address = snapshot.getValue(Garbage.class);
            setValue(address);
            Garbage city = snapshot.getValue(Garbage.class);
            setValue(city);
            Garbage itemDescription = snapshot.getValue(Garbage.class);
            setValue(itemDescription);
        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {
        }
    };
    DatabaseReference databaseReference;

    public GarbageLiveData(DatabaseReference ref) {
        databaseReference = ref;
    }

    @Override
    protected void onActive() {
        super.onActive();
        databaseReference.addValueEventListener(listener);
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        databaseReference.removeEventListener(listener);
    }
}
