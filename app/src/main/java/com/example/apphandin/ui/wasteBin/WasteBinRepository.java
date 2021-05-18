package com.example.apphandin.ui.wasteBin;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.internal.EverythingIsNonNull;

public class WasteBinRepository {
    private static WasteBinRepository instance;
    private final MutableLiveData<WasteBin> searchedWasteBin;

    private WasteBinRepository() {
        searchedWasteBin = new MutableLiveData<>();
    }

    public static synchronized WasteBinRepository getInstance() {
        if (instance == null) {
            instance = new WasteBinRepository();
        }
        return instance;
    }

    public LiveData<WasteBin> getSearchedWasteBin() {
        return searchedWasteBin;
    }

    public  void  searchForWasteBin (String wasteBinAddress) {
        WasteBinAPI wasteBinAPI = ServiceGenerator.getWasteBinAPI();
        Call<WasteBinResponse> call = wasteBinAPI.getWasteBin();
        call.enqueue(new Callback<WasteBinResponse>() {
            @EverythingIsNonNull
            @Override
            public void onResponse(Call<WasteBinResponse> call, Response<WasteBinResponse> response) {
                if (response.isSuccessful()) {
                    searchedWasteBin.setValue(response.body().getWasteBin());
                }
            }
            @EverythingIsNonNull
            @Override
            public void onFailure(Call<WasteBinResponse> call, Throwable t) {
                Log.i("Retrofit", "Something went wrong:(");

            }
        });
    }
}
