package com.omshinde.webautomastery.data.clients;

import com.omshinde.webautomastery.models.User;

public class UserDataClient extends DataClient{

    public User getBlockedUserForSpam(){
        String filepath=getFilePath("users/blockedUsers.json");
        return (User) dataMapper.map(filepath,"userBlockedSpam",User.class);
    }

}
