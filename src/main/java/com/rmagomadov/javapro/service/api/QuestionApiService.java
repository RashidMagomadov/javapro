package com.rmagomadov.javapro.service.api;

import com.rmagomadov.javapro.model.Question;
import com.rmagomadov.javapro.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class QuestionApiService {

    private final QuestionService questionService;

    @Async
    public void save(Question question) {
        questionService.save(question);
    }
}
