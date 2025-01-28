package com.example.quiz.controller;

import com.example.quiz.entity.DotNetQuestion;
import com.example.quiz.service.DotNetQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/dotnet")
public class dotnet_Controller {

    @Autowired
    DotNetQuestionService dotNetQuestionService;

    // Fetch all .NET questions
    @GetMapping("/questions")
    public List<DotNetQuestion> getRandomQuestions() {
        return dotNetQuestionService.getRandomQuestions();
    }

    // Save multiple .NET questions
    @PostMapping(value = "/saveAll", consumes = "application/json", produces = "application/json")
    public List<DotNetQuestion> saveQuestions(@RequestBody List<DotNetQuestion> questions) {
        return dotNetQuestionService.saveQuestions(questions);
    }

}
