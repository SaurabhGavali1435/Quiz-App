package com.example.quiz.controller;

import com.example.quiz.entity.JavaScriptQuestion;
import com.example.quiz.service.JavaScriptQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/javascript")
public class javaScript_Controller {

    @Autowired
    private JavaScriptQuestionService javaScriptQuestionService;

    // Fetch all JavaScript questions
    @GetMapping("/questions")
    public List<JavaScriptQuestion> getQuestions() {
        return javaScriptQuestionService.getAllQuestions();
    }

    // Save multiple JavaScript questions
    @PostMapping(value = "/saveAll", consumes = "application/json", produces = "application/json")
    public List<JavaScriptQuestion> saveQuestions(@RequestBody List<JavaScriptQuestion> questions) {
        return javaScriptQuestionService.saveQuestions(questions);
    }
}
