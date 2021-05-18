package com.example.apphandin.ui.tips;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Tip.class}, version = 1)
public abstract class TipDatabase extends RoomDatabase {

    private static TipDatabase instance;

    public abstract TipDao tipDao();

    public static synchronized TipDatabase getInstance(Context context){
        if(instance == null) {
            instance = Room.databaseBuilder(context,
                    TipDatabase.class, "tip_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }


}
