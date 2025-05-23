package com.cebtAlura.currencyConverter;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        String address;                             //URL address
        String apiKey = "d86ac12f1e7a75ad40c7ce88"; //API key

        //API connection
        HttpClient client = HttpClient.newHttpClient();
        //Address to ExchangeRate-API
        address = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/USD";

        //Request to API connection
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))   //Specify the URL address
                .build();                   //Completes the construction of the request and returns the complete object.

        //Send a request to the API, receive the format in string
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        //Creation a variable to save the information returned by API
        String json = response.body();
        //System.out.println(json);

        //Creation of Gson object
        Gson gson = new Gson();
            //Record to receive the external objects
        exchangeApiInformation kindCurency = gson.fromJson(json, exchangeApiInformation.class);
        //Record to receive the internal objects
        converter convertionCurrency = kindCurency.conversion_rates();
        //System.out.println(convertionCurrency);

        //Principally object
        Conversor menuConverter = new Conversor(convertionCurrency);
        menuConverter.Menu();
    }
}
