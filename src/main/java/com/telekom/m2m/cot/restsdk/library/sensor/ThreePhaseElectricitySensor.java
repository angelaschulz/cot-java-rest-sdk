package com.telekom.m2m.cot.restsdk.library.sensor;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.telekom.m2m.cot.restsdk.library.Fragment;

public class ThreePhaseElectricitySensor implements Fragment{

    

    @Override
    public String getId() {
        return "c8y_ThreePhaseElectricitySensor";
    }

    @Override
    public JsonElement getJson() {
        return new JsonObject();


    }
}