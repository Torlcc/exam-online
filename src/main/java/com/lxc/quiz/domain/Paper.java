package com.lxc.quiz.domain;

import lombok.Data;

import java.util.List;

@Data
public class Paper {
    private int paperId;
    private String paperName;
    private int scoreSin;
    private int scoreChe;
    private int scoreJug;
}
