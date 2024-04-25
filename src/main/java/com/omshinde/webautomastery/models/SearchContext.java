package com.omshinde.webautomastery.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchContext {
    private String key;

    public SearchContext init(){
        return SearchContext.builder()
                .key("Dress")
                .build();
    }

}
