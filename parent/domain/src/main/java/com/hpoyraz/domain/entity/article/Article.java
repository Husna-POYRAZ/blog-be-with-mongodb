package com.hpoyraz.domain.entity.article;

import com.hpoyraz.domain.entity.author.Author;
import com.hpoyraz.domain.entity.category.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "articles")
public class Article {
    @Id
    private long id;
    private Author author;
    @Indexed(unique = true)
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
