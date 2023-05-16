package com.hpoyraz.domain.repository.article;

import com.hpoyraz.domain.entity.article.Article;
import com.hpoyraz.domain.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticleRepository extends BaseRepository<Article, Long> {
}
