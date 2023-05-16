package com.hpoyraz.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
    private long id;
    private String name;
    private String surname;
    private String title;
}
