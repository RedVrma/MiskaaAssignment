package com.puneetverma.miskaa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.puneetverma.miskaa.rest.CountriesSearchApi;
import com.puneetverma.miskaa.rest.RestApiUtils;
import com.puneetverma.miskaa.rest.models.country.SingleCountry;
import com.puneetverma.miskaa.room.AppDatabase;
import com.puneetverma.miskaa.room.SingleCountrydb;
import com.puneetverma.miskaa.room.UserDao;

import java.lang.reflect.Type;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    Button btn_delete;
    Button btn_load;

    ArrayList<SingleCountrydb> singleCountrydbs;
    RvCountriesAdaptor adaptor;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_delete=findViewById(R.id.btn_delete);
        btn_load=findViewById(R.id.btn_load);

        rv=findViewById(R.id.rv_countries);
        rv.setLayoutManager(new LinearLayoutManager(this));

        getDataFromNetwork();
        getDataFromDB();


        adaptor = new RvCountriesAdaptor(this,singleCountrydbs);





        btn_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataFromNetwork();
                getDataFromDB();


            }
        });


        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppDatabase db = AppDatabase.getDBInstance(MainActivity.this);
                db.userDao().delete();
                Toast.makeText(MainActivity.this, "Local Data Deleted", Toast.LENGTH_SHORT).show();
                singleCountrydbs.clear();
                adaptor.notifyDataSetChanged();

            }
        });




        rv.setAdapter(adaptor);








    }






    private void getDataFromNetwork() {

        CountriesSearchApi countriesSearchApi = RestApiUtils.getCountrySearchApi();

        Call<ArrayList<SingleCountry>> countryCall = countriesSearchApi.getCountries();

        countryCall.enqueue(new Callback<ArrayList<SingleCountry>>() {
            @Override
            public void onResponse(Call<ArrayList<SingleCountry>> call, Response<ArrayList<SingleCountry>> response) {

                ArrayList<SingleCountry> singleCountryArrayList = response.body();

                saveIntoDB(singleCountryArrayList);
            }

            @Override
            public void onFailure(Call<ArrayList<SingleCountry>> call, Throwable t) {
            }
        });

    }


    private void getDataFromDB() {

        AppDatabase db = AppDatabase.getDBInstance(this.getApplicationContext());

        singleCountrydbs = (ArrayList<SingleCountrydb>) db.userDao().getAllCountries();
        adaptor=new RvCountriesAdaptor(this, singleCountrydbs);
        adaptor.notifyDataSetChanged();

    }


    private void saveIntoDB(ArrayList<SingleCountry> data) {

        AppDatabase db = AppDatabase.getDBInstance(this.getApplicationContext());
        ArrayList<SingleCountrydb>  countrydbs = new ArrayList<>();

        Gson gson = new Gson();

//        String dataString =  gson.toJson(data);
//
//        //before transfering  object to gson...this logd shows object data direct from retrofit
//        Log.d("langi", "data: " + data.get(0).getLanguages().get(0).name);
//
//        Type type = new TypeToken<ArrayList<SingleCountrydb>>() {
//        }.getType();
//
//        ArrayList<SingleCountrydb> intoDB= gson.fromJson(dataString,type);
//
//
//
//        //after transfering  gson to object...this logd shows intoDB data
//        Log.d("langi", "IntoDB: " + intoDB.get(0).getLanguages());



        for(int i=0;i<data.size();i++)
        {
            SingleCountrydb dbb = new SingleCountrydb();
//            dbb=intoDB.get(i);
//            name, capital, flag(display image in app), region,
//                    subregion, population, borders & languages.


            dbb.setName(data.get(i).getName());
            dbb.setCapital(data.get(i).getCapital());
            dbb.setRegion(data.get(i).getRegion());
            dbb.setSubregion(data.get(i).getSubregion());
            dbb.setPopulation(data.get(i).getPopulation());
            dbb.setBorders(gson.toJson(data.get(i).getBorders()));

            dbb.setFlag(data.get(i).getFlag());

            dbb.setLanguages(gson.toJson(data.get(i).getLanguages()));

            db.userDao().addCountry(dbb);

        }



    }
}