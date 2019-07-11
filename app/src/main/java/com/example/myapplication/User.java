package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class User {

    Context context;

    public void removeuser(){

        sharedPreferences.edit().clear().commit();
    }


    public String getName() {
        name=sharedPreferences.getString("userdata","");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        sharedPreferences.edit().putString("userdata",name).commit();  //set the value and commit it
    }

    private String name;
    SharedPreferences sharedPreferences;      //obj of shared prefrences


    public User(Context context){
        this.context=context;
        sharedPreferences=context.getSharedPreferences("userinfo",context.MODE_PRIVATE); //userinfo will create file is we are launching 1st tine otherwise it refer previous one


    }




}
