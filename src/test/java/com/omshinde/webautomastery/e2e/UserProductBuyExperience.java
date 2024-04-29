package com.omshinde.webautomastery.e2e;

import com.omshinde.webautomastery.data.clients.OrderDataClient;
import com.omshinde.webautomastery.data.clients.ProductDataClient;
import com.omshinde.webautomastery.models.Order;
import com.omshinde.webautomastery.models.Product;
import org.testng.annotations.Test;

public class UserProductBuyExperience {
//    @Test
//    public void verifyUserIsAbleToBuyProduct(){
//        ProductDataClient productDataClient=new ProductDataClient();
//        Product skiesProduct = productDataClient.getSkiesProduct();
//        System.out.println(skiesProduct);
//
//    }

    @Test
    public void orderDataClient(){
        OrderDataClient orderDataClient=new OrderDataClient();
        Order singleOrder = orderDataClient.getSingleOrder();
        System.out.println(singleOrder);
    }
}
