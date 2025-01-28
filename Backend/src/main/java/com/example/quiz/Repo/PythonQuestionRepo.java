package com.example.quiz.Repo;

import com.example.quiz.entity.PythonQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PythonQuestionRepo extends JpaRepository<PythonQuestion, Long> {

    @Query(value = "SELECT * FROM python_question ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<PythonQuestion> findRandomQuestions();
}
