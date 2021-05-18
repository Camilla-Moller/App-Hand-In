package com.example.apphandin.ui.wasteBin;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WasteBinAPI {

        @GET("spatialmap?page=get_geojson_opendata&datasource=affaldsspande")
        Call<WasteBinResponse> getWasteBin();
    }
