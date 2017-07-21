package com.londonappbrewery.bitcointicker;

import android.provider.ContactsContract;
import android.support.annotation.Nullable;

import org.json.JSONObject;

/**
 * Created by Hari on 7/21/2017.
 */

public class DataModel {
    private double mPrice;
    @Nullable
    public static DataModel fromJSON(JSONObject jsonObject){
        DataModel dataModel = new DataModel();
        try{
            dataModel.mPrice = jsonObject.getDouble("last");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return dataModel;
    }

    public double getPrice() {
        return mPrice;
    }
}
