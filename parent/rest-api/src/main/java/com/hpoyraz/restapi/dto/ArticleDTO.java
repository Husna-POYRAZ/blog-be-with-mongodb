package com.hpoyraz.restapi.dto;

import com.hpoyraz.domain.entity.author.Author;
import com.hpoyraz.domain.entity.category.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {
    private long id;
    private Author author;
    private String title;
    private String body;
    private Category category;
    private String group;
    private Date date;
    private int readTime;//in minutes
    private String headerImageUrl;
    private String[] images;
    private String[] embeddedLinks;
}
