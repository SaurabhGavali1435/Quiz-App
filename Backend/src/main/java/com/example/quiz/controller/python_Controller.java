package com.example.quiz.controller;

import com.example.quiz.entity.PythonQuestion;
import com.example.quiz.service.PythonQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/python")
public class python_Controller {  // Renamed to follow Java conventions

    @Autowired
    PythonQuestionService pythonQuestionService;  // Use autowired service instance

    // Fetch all Python questions
    @GetMapping("/questions")
    public List<PythonQuestion> getQuestions() {
        return pythonQuestionService.getAllQuestions();  // Corrected to call the service instance
    }

    // Save multiple Python questions
    @PostMapping(value = "/saveAll", consumes = "application/json", produces = "application/json")
    public List<PythonQuestion> saveQuestions(@RequestBody List<PythonQuestion> questions) {
        return pythonQuestionService.saveQuestions(questions);  // Corrected to call the service instance
    }
}
