package com.hpoyraz.domain.service.impl;

import com.hpoyraz.domain.entity.article.Article;
import com.hpoyraz.domain.repository.article.IArticleRepository;
import com.hpoyraz.domain.service.interfaces.IArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService implements IArticleService {
    private final IArticleRepository articleRepository;

    @Override
    public Page<Article> findAll(Pageable pageable) {
        return articleRepository.findAll(pageable);
    }

}

