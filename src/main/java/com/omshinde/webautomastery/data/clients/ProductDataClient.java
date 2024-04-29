package com.omshinde.webautomastery.data.clients;

import com.omshinde.webautomastery.models.Product;

public class ProductDataClient extends DataClient{
    public Product getSkiesProduct(){
        String filepath=getFilePath("products.json");
        return (Product) dataMapper.map(filepath,"skiesProduct", Product.class);
    }
}
