package com.cebtAlura.currencyConverter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String address;
        String apiKey = "d86ac12f1e7a75ad40c7ce88";

        //API connection
        HttpClient client = HttpClient.newHttpClient();

        address = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/USD";

        //Request to API connection
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))   //Specify the URL address
                .build();                   //Completes the construction of the request and returns the complete object.

        //Creation of Gson object
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        //Send a request to the API, receive the format in string
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Creation a variable to save the information returned by API
        String json = response.body();
        System.out.println(json);

        /*converter kindMoney = gson.fromJson(json, converter.class);
        System.out.println("Conversion" + kindMoney);*/
    }
}
