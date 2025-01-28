package com.example.quiz.service;

import com.example.quiz.Repo.JavaScriptQuestionRepo;
import com.example.quiz.entity.JavaScriptQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavaScriptQuestionService {

    @Autowired
    private JavaScriptQuestionRepo javaScriptQuestionRepo;


    // Save multiple JavaScript questions
    public List<JavaScriptQuestion> saveQuestions(List<JavaScriptQuestion> questions) {
        return javaScriptQuestionRepo.saveAll(questions);
    }

    // Retrieve all JavaScript questions
    public List<JavaScriptQuestion> getAllQuestions() {
        return javaScriptQuestionRepo.findRandomQuestions();
    }
}
