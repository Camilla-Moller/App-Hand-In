package com.example.apphandin.ui.wasteBin;

import java.util.List;

public class WasteBinResponse {

    private List<Feature> features;

    public WasteBin getWasteBin() {
        return new WasteBin(features.get(0).properties.na_street_name);
    }

    private class Feature {
        private Properties properties;



        private class Properties {
            private String na_street_name;
        }

    }
}
