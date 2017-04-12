package com.sdajava.json;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try{
            URL url = new URL("http://lukaszogan.com/data.json");
            URLConnection connect = url.openConnection();
            BufferedReader in =
                new BufferedReader(new InputStreamReader(connect.getInputStream()));

            String line;
            while ((line = in.readLine()) != null){

                JSONArray array = (JSONArray) parser.parse(line);

                for(Object obj: array){

                    JSONObject json = (JSONObject) obj;

                    System.out.println("ID posta " + json.get("ID"));

                }

            }


        }catch (ParseException | IOException err){

        }


    }
}
