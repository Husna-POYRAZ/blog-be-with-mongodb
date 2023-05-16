package com.hpoyraz.restapi.mapper;

import com.hpoyraz.domain.entity.article.Article;
import com.hpoyraz.restapi.dto.ArticleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IArticleMapper {
    //----------------------
    // DTO => ARTICLE
    //----------------------

    Article toArticle(ArticleDTO articleDTO);

    //----------------------
    // ARTICLE => DTO
    //----------------------

    ArticleDTO fromArticle(Article article);
}
