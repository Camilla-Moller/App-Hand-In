package com.example.apphandin.ui.tips;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TipDao {

    @Insert
    void insert(Tip tip);

    @Update
    void update(Tip tip);

    @Delete
    void delete(Tip tip);

    @Query("SELECT * FROM tip_table ORDER BY priority DESC")
    LiveData<List<Tip>> getAllTips();
}
