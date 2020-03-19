package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataSource {
    private Retrofit retrofit;

    public List<String> getCars() {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Porsche");
        cars.add("Dacia");
        cars.add("VW");
        cars.add("Audi");
        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("Mini");
        cars.add("Lada");
        cars.add("Citroen");
        cars.add("Renault");
        cars.add("Ferarri");
        cars.add("Maseratti");
        cars.add("Alfa romeo");
        cars.add("Lambo");
        cars.add("Ford");

        return cars;
    }

    public List<Object>getServerDataSource(){
        if(retrofit ==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://raw.githubusercontent.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        RetrofitApi retrofitApi =retrofit.create(RetrofitApi.class);
        retrofitApi.getPersons().enqueue(new Callback<List<Person>>() {
            @Override
            public void onResponse(Call<List<Person>> call, Response<List<Person>> response) {
                if(response.isSuccessful()){
                    List<Person> serverPeople = response.body();
                }
            }

            @Override
            public void onFailure(Call<List<Person>> call, Throwable t) {

            }
        });
        return null;
    }
}
