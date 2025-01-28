package com.example.quiz.controller;


import com.example.quiz.entity.JavaQuestion;
import com.example.quiz.service.JavaQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/java")
public class java_Controller {


    @Autowired
    JavaQuestionService javaQuestionService;


    @GetMapping("/questions")
    public List<JavaQuestion> getQuestions() {
        return javaQuestionService.getAllQuestions();
    }


    @PostMapping(value = "/saveAll", consumes = "application/json", produces = "application/json")
    public List<JavaQuestion> saveQuestion(@RequestBody List<JavaQuestion> questions) {
        return javaQuestionService.saveQuestions(questions);
    }

}