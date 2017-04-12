package com.sdajava.json;


import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try{
            URL url = new URL("http://lukaszogan.com/data.json");
            URLConnection connect = url.openConnection();
            BufferedReader in =
                new BufferedReader(new InputStreamReader(connect.getInputStream()));

            in.lines().forEach(System.out::println);


        }catch (IOException err){

        }


    }
}
