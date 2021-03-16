package com.puneetverma.miskaa;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.media.Image;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.caverock.androidsvg.SVG;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.puneetverma.miskaa.rest.models.country.Language;
import com.puneetverma.miskaa.room.SingleCountrydb;
import com.puneetverma.miskaa.room.models.LanguageDB;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class RvCountriesAdaptor extends RecyclerView.Adapter<RvCountriesAdaptor.myHolder> {


    Context context;

    ArrayList<SingleCountrydb> CountriesList;


    public RvCountriesAdaptor(Context context, ArrayList<SingleCountrydb> countriesList) {
        this.context = context;
        CountriesList = countriesList;
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_rv_countries,parent,false);


        return new myHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder holder, int position) {

        Type type = new TypeToken<ArrayList<LanguageDB>>() {
        }.getType();
        Gson gson = new Gson();
        ArrayList<LanguageDB> Language= gson.fromJson(CountriesList.get(position).getLanguages(),type);

        Type type2 = new TypeToken<ArrayList<String>>() {
        }.getType();
        ArrayList<String> borderList= gson.fromJson(CountriesList.get(position).getBorders(),type2);

        Log.d("hloe", "onBindViewHolder: " +Language);
        Log.d("hloe2", "onBindViewHolder: " +borderList);

        holder.tv_name.setText("Name : "+CountriesList.get(position).getName());
        holder.tv_capital.setText("Capital : "+CountriesList.get(position).getCapital());
        holder.tv_region.setText("Region : "+CountriesList.get(position).getRegion());
        holder.tv_subregion.setText("SubRegion : "+CountriesList.get(position).getSubregion());
        holder.tv_population.setText("Population : "+CountriesList.get(position).getPopulation().toString());

        holder.tv_borders.setText("Borders : ");
        for(int i=0;i<borderList.size();i++)
        {
            holder.tv_borders.append(borderList.get(i)+",");
        }
//
        holder.tv_languages.setText("Languages : ");
        for(int i=0;i<Language.size();i++)
        {
            holder.tv_languages.append(Language.get(i).getName()+" , " +Language.get(i).getNativeName());
        }

        Log.d("photo", "onBindViewHolder: " +CountriesList.get(position).getFlag());


//        Glide.with(context).load("https://cdn4.iconfinder.com/data/icons/small-n-flat/24/user-alt-512.png")
//                .into(holder.flag);

        GlideApp.with(context).load(CountriesList.get(position).getFlag()).apply(RequestOptions.centerCropTransform())
                .into(holder.flag);

























//        Log.d("checke", "onBindViewHolder: "+ CountriesList.get(position).getLanguages());
//
////        holder.tv_languages.setText(CountriesList.get(position).getLanguages().get(0).getName());


    }

    @Override
    public int getItemCount() {
        return CountriesList.size();
    }

    public class myHolder extends RecyclerView.ViewHolder
    {

        ImageView flag;

        TextView tv_name;
        TextView tv_capital;
        TextView tv_region;
        TextView tv_subregion;
        TextView tv_population;
        TextView tv_borders;
        TextView tv_languages;


        public myHolder(@NonNull View itemView) {
            super(itemView);

            flag=itemView.findViewById(R.id.iv_country_flag);

            tv_name =itemView.findViewById(R.id.tv_country_name);
            tv_capital=itemView.findViewById(R.id.tv_country_capital);
            tv_region=itemView.findViewById(R.id.tv_country_region);
            tv_subregion=itemView.findViewById(R.id.tv_country_subregion);
            tv_population=itemView.findViewById(R.id.tv_country_population);
            tv_borders=itemView.findViewById(R.id.tv_country_borders);
            tv_languages=itemView.findViewById(R.id.tv_country_languages);


        }
    }

}
