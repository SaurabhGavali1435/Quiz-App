package com.example.quiz.Repo;

import com.example.quiz.entity.JavaScriptQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JavaScriptQuestionRepo extends JpaRepository<JavaScriptQuestion, Long> {

    @Query(value = "SELECT * FROM java_script_question ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<JavaScriptQuestion> findRandomQuestions();

}
