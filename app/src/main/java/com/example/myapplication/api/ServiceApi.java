package com.example.myapplication.api;

import com.example.myapplication.models.Libro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {

    @GET("libro")
    public abstract Call<List<Libro>> listaLibro();


}
