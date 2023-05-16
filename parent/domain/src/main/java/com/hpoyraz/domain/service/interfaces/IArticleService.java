package com.hpoyraz.domain.service.interfaces;

import com.hpoyraz.domain.entity.article.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface IArticleService {
    Page<Article> findAll(Pageable pageable);
}
