package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.api.ServiceApi;
import com.example.myapplication.models.Libro;
import com.example.myapplication.util.ConnectionRest;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> Libro = new ArrayList<String>();
    ListView lstLib = null;

    ArrayAdapter adaptador = null;
    private ServiceApi api = ConnectionRest.getConnection().create(ServiceApi.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lstLib = (ListView) findViewById(R.id.lstLibro_);
        adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1,Libro);
        lstLib.setAdapter(adaptador);

        cargaLibro();

    }
    public void cargaLibro(){


        Call<List<Libro>> call = api.listaLibro();
        call.enqueue(new Callback<List<Libro>>() {
            @Override
            public void onResponse(Call<List<Libro>> call, Response<List<Libro>> response) {
                List<Libro> list = response.body();
                for(Libro x:list){
                    Libro.add(x.getTitulo());
                }
                adaptador.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Libro>> call, Throwable t) {
                Toast.makeText(null,"Ocurrio un error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}