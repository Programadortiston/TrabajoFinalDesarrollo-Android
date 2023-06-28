package com.example.myapplication.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConnectionRest {

    private static Retrofit retrofit = null;
    private static final String RUTA="http://sebastianbejar-001-site1.atempurl.com/api/";

    public static Retrofit getConnection(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(RUTA)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
