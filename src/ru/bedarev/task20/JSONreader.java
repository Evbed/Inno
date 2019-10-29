package ru.bedarev.task20;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONreader {
    public static void main(String[] args) {
        Weather weather;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        try {
            weather = objectMapper.readValue(new URL("https://api.oceandrivers.com/static/resources.json"), Weather.class);
            System.out.println(weather.toString());
        } catch (MalformedURLException | JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}















     /*   try {
            URL url = new URL("https://api.oceandrivers.com/static/resources.json");
            try (InputStream is = url.openStream()) {
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    objectMapper.writeValue(is, weather);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/


//"https://api.oceandrivers.com/static/resources.json"