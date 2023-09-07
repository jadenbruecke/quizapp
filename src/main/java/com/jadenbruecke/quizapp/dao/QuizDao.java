package com.jadenbruecke.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jadenbruecke.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
