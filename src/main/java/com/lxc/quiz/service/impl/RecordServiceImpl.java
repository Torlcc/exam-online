package com.lxc.quiz.service.impl;

import com.lxc.quiz.domain.Classe;
import com.lxc.quiz.domain.Record;
import com.lxc.quiz.domain.RecordExam;
import com.lxc.quiz.domain.Toscore;
import com.lxc.quiz.mapper.RecordMapper;
import com.lxc.quiz.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @Override
    public void addRecord(Record record) {

    }

    @Override
    public List<Record> queryAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Record> queryAllExamById(Integer id) {
        return null;
    }

    @Override
    public Integer queryByRecordId(Integer id) {
        return null;
    }

    @Override
    public String queryAnsByRecordId(Integer id) {
        return null;
    }

    @Override
    public List<Record> queryRankScoreRecord() {
        return null;
    }

    @Override
    public List<Record> queryRankAccRecord() {
        return null;
    }

    @Override
    public List<Record> queryAllExam() {
        return null;
    }

    @Override
    public List<Classe> queryAllClass(String exaName) {
        return null;
    }

    @Override
    public int queryAllScore(RecordExam recordExam) {
        return 0;
    }

    @Override
    public int queryAccScore(RecordExam recordExam) {
        return 0;
    }

    @Override
    public void AddToScore(Toscore toscore) {

    }

    @Override
    public int queryBooleanToscore(Integer paperId) {
        return 0;
    }

    @Override
    public int queryToscore(int paperId) {
        return 0;
    }
}
