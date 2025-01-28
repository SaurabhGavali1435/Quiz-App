package com.example.quiz.Repo;


import com.example.quiz.entity.JavaQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JavaQuestionRepo extends JpaRepository<JavaQuestion, Long> {

    @Query(value = "SELECT * FROM java_question ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<JavaQuestion> findRandomQuestions();

}
