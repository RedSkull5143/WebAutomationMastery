package com.omshinde.webautomastery.models;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
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

    @Step("Generating User Data")
    public User init(){
        Faker dataFaker=new Faker();
        return User.builder()
                .firstName(dataFaker.name().firstName())
                .lastName(dataFaker.name().lastName())
                .email(dataFaker.internet().emailAddress())
                .password("pass123@")
                .build();
    }

    public User userWithValidCredentials(){
        return User.builder()
                .firstName("Om")
                .lastName("Shinde")
                .email("omshinde@gmail.com")
                .password("OmShinde@1234")
                .build();
    }

    public User userWithInvalidCredentials(){
        return User.builder()
                .firstName("Om")
                .lastName("Shinde")
                .email("omshnde@gmail.com")
                .password("OmShinde@1234")
                .build();
    }

    public User userWithEmptyFirstName(){
        User user = this.init();
        user.setFirstName("");
        return user;
    }

}
