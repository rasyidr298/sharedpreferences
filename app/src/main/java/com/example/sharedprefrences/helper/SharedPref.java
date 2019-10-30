package com.example.sharedprefrences.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPref {

    private static SharedPref INSTANCE;
    private SharedPreferences sharedPreferences;
    
    private final String SP_NAME = "loginsession";

    public SharedPref(Context context){
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences(SP_NAME,Context.MODE_PRIVATE);
    }


    public static SharedPref getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = new SharedPref(context);
        }
        return INSTANCE;
    }

    public SharedPreferences Pref(){
        return sharedPreferences;
    }

    public Boolean isLogin(){
        return sharedPreferences.getBoolean("istLogin", false );
    }

    public void setLogin (boolean isCall){
        sharedPreferences.edit().putBoolean("istLogin", isCall).apply();
    }

    public void setNama(String isNama){
        sharedPreferences.edit().putString("isNama", isNama).apply();
    }
    public String getUsername() {
        return sharedPreferences.getString("","admin");
    }

    public String getNamaku() {
        return sharedPreferences.getString("","Rasyid Ridla");
    }

}
