package com.rmagomadov.javapro.mapper;

import com.rmagomadov.javapro.dto.ArticleLinkResponse;
import com.rmagomadov.javapro.model.Article;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleToArticleLinkResponseMapper {

    ArticleLinkResponse convert(Article article);

    List<ArticleLinkResponse> convert(List<Article> articles);
}
