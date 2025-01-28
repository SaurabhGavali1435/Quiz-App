package com.example.quiz.service;

import com.example.quiz.Repo.PythonQuestionRepo;
import com.example.quiz.entity.PythonQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PythonQuestionService {

    @Autowired
    private PythonQuestionRepo pythonQuestionRepo;


    // Save multiple Python questions
    public List<PythonQuestion> saveQuestions(List<PythonQuestion> questions) {
        return pythonQuestionRepo.saveAll(questions);
    }

    // Retrieve all Python questions
    public List<PythonQuestion> getAllQuestions() {
        return pythonQuestionRepo.findRandomQuestions();
    }
}
