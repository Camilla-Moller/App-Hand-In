package com.example.apphandin.ui.wasteBin;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static WasteBinAPI wasteBinAPI;

    public  static  WasteBinAPI getWasteBinAPI() {
        if (wasteBinAPI == null) {
            wasteBinAPI = new Retrofit.Builder()
                    .baseUrl("https://webkort.aarhuskommune.dk/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(WasteBinAPI.class);
        }
        return wasteBinAPI;
    }
}
