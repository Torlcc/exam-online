package com.lxc.quiz.service.impl;

import com.lxc.quiz.service.ExamService;
import com.lxc.quiz.domain.Exam;
import com.lxc.quiz.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;


    @Override
    public List<Exam> getAll() {
        return null;
    }

    @Override
    public int queryCOuntALlExam() {
        return 0;
    }

    @Override
    public void AddExam(Exam exam) {

    }

    @Override
    public Exam getExamById(Integer id) {
        return null;
    }

    @Override
    public void EditExam(Exam exam) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Exam> getAllS() {
        return null;
    }
}
