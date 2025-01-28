package com.example.quiz.Repo;

import com.example.quiz.entity.DotNetQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DotNetQuestionRepo extends JpaRepository<DotNetQuestion, Long> {

    @Query(value = "SELECT * FROM dot_net_question ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<DotNetQuestion> findRandomQuestions();

}
