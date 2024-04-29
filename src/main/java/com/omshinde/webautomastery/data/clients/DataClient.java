package com.omshinde.webautomastery.data.clients;

import com.google.gson.internal.LinkedTreeMap;
import com.omshinde.webautomastery.data.mappers.DataMapper;
import com.omshinde.webautomastery.data.mappers.JSONDataMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Objects;

public class DataClient {
    protected DataMapper dataMapper;
    public DataClient() {
        dataMapper = new JSONDataMapper();
    }

    protected String getFilePath(String relativePath) {
        return Objects.requireNonNull(this.getClass()
                        .getClassLoader()
                        .getResource(String.format("data_sets/%s",relativePath)))
                .getPath();
    }
}
