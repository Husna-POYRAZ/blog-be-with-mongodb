package com.hpoyraz.domain.entity.author;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "authors")
public class Author {
    @Id
    private long id;
    private String name;
    private String surname;
    private String title;
}
