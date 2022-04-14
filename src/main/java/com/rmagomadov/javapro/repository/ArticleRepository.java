package com.rmagomadov.javapro.repository;

import com.rmagomadov.javapro.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {

    List<Article> findAllByTitleContainsIgnoreCase(String title);
}
