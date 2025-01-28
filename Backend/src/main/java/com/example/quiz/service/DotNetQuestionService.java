package com.example.quiz.service;

import com.example.quiz.Repo.DotNetQuestionRepo;
import com.example.quiz.entity.DotNetQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DotNetQuestionService {

    @Autowired
    private DotNetQuestionRepo dotNetQuestionRepo;


    public List<DotNetQuestion> getRandomQuestions() {
        return dotNetQuestionRepo.findRandomQuestions();
    }

    // Save multiple .NET questions
    public List<DotNetQuestion> saveQuestions(List<DotNetQuestion> questions) {
        return dotNetQuestionRepo.saveAll(questions);
    }

}
