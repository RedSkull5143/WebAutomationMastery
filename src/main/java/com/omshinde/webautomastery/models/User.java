package com.omshinde.webautomastery.models;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User init(){
        Faker dataFaker=new Faker();
        return User.builder()
                .firstName(dataFaker.name().firstName())
                .lastName(dataFaker.name().lastName())
                .email(dataFaker.internet().emailAddress())
                .password("pass123@")
                .build();
    }

    public User userWithEmptyFirstName(){
        User user = this.init();
        user.setFirstName("");
        return user;
    }
}
