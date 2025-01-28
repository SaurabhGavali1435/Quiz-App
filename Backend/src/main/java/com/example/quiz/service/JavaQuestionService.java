package com.example.quiz.service;

import com.example.quiz.Repo.JavaQuestionRepo;
import com.example.quiz.entity.JavaQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JavaQuestionService {

    @Autowired
    private JavaQuestionRepo javaQuestionRepo;


    // New method to save multiple questions
    public List<JavaQuestion> saveQuestions(List<JavaQuestion> questions) {
        return javaQuestionRepo.saveAll(questions);
    }

    // Existing method to get all questions
    public List<JavaQuestion> getAllQuestions() {
        return javaQuestionRepo.findRandomQuestions();
    }

}
