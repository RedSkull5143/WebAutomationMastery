package com.omshinde.webautomastery.data.mappers;

import com.omshinde.webautomastery.models.Product;

public interface DataMapper<T> {
    //generics
    T map(String filename, String key, Class<T> tClass);
}
