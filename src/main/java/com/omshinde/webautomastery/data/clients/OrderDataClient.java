package com.omshinde.webautomastery.data.clients;

import com.omshinde.webautomastery.models.Order;

public class OrderDataClient extends DataClient{
    public Order getSingleOrder(){
        String filepath=getFilePath("orders/validOrders.json");
        return (Order) dataMapper.map(filepath,"userWithOneOrder",Order.class);
    }
}
