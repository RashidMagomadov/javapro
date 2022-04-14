package com.rmagomadov.javapro.service;

import com.rmagomadov.javapro.model.Question;
import com.rmagomadov.javapro.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public void save(Question question) {
        questionRepository.save(question);
    }
}
