package com.example.apphandin.ui.tips;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TipRepository {

    private static TipRepository instance;
    private final TipDao tipDao;
    private final LiveData<List<Tip>> allTips;
    private final ExecutorService executorService;

    private TipRepository(Application application) {
        TipDatabase database = TipDatabase.getInstance(application);
        tipDao = database.tipDao();
        allTips = tipDao.getAllTips();
        executorService = Executors.newFixedThreadPool(2);
    }

    public static synchronized TipRepository getInstance(Application application) {
        if (instance == null)
            instance = new TipRepository(application);

        return instance;
    }

    public LiveData<List<Tip>> getAllTips() {
        return allTips;
    }

    public void insert(Tip tip) {
        executorService.execute(() -> tipDao.insert(tip));
    }

}
