package com.omshinde.webautomastery.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private String name;
    private String seller;
    private String label;
    private String originalPrice;
    private String salePrice;
    private String description;
    private List<String> sizes;
}
