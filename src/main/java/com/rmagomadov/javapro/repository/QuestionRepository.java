package com.rmagomadov.javapro.repository;

import com.rmagomadov.javapro.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}
