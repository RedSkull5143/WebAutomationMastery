package com.omshinde.webautomastery.data.mappers;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Objects;

public class JSONDataMapper<T> implements DataMapper<T>{

    @Override
    public T map(String filename, String key, Class<T> tClass){
        Gson gson = new Gson();
        try {
            Map jsonMap = gson.fromJson(new FileReader(filename), Map.class);
            LinkedTreeMap jsonElement = (LinkedTreeMap) jsonMap.get(key);
            if(Objects.isNull(jsonElement)) throw new FileNotFoundException();
            return gson.fromJson(jsonElement.toString(), tClass);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(String.format("Failed to find data for key %s in file %s or filepath %s itself is wrong", key, filename, filename));
        }
    }
}

