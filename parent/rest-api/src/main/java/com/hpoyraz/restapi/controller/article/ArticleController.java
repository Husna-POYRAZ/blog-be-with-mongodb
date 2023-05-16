package com.hpoyraz.restapi.controller.article;

import com.hpoyraz.domain.entity.article.Article;
import com.hpoyraz.domain.service.interfaces.IArticleService;
import com.hpoyraz.restapi.dto.ArticleDTO;
import com.hpoyraz.restapi.mapper.IArticleMapper;
import com.hpoyraz.restapi.utils.constants.Apis;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springdoc.api.annotations.ParameterObject;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping(Apis.Article.BASE_URL)
public class ArticleController {
    private final IArticleService articleService;
    private final IArticleMapper articleMapper;

    @GetMapping("/")
    public List<ArticleDTO> searchArticle(@ParameterObject Pageable pageable) {
        return articleService.findAll(pageable).stream().map(articleMapper::fromArticle).collect(Collectors.toList());

    }
}

// type 1
/*
    @GetMapping("/")
    public List<ArticleDTO> searchArticle(@ParameterObject Pageable pageable) {
        //return articleService.findAll(pageable).stream().map(articleMapper::fromArticle).collect(Collectors.toList());
        Page<Article> articles = articleService.findAll(pageable);
        List<ArticleDTO> articleDTOList = new ArrayList<>();
        for(Article a : articles) {
            ArticleDTO articleDTO = articleMapper.fromArticle(a);
            articleDTOList.add(articleDTO);
        }
        return articleDTOList;
    }
*/
// type 2
//return articleService.findAll(pageable).stream().map(article -> articleMapper.fromArticle(article)).collect(Collectors.toList());