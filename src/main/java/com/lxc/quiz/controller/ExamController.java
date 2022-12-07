package com.lxc.quiz.controller;

import com.lxc.quiz.domain.Exam;
import com.lxc.quiz.domain.QuestionPaper;
import com.lxc.quiz.service.ExamService;
import com.lxc.quiz.service.PaperService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/exam")
public class ExamController {
   @Autowired
   PaperService paperService;
   @Autowired
   ExamService examService;
    //提交试卷
    @RequestMapping("/submitExam")
    public String submitExam(Integer paperId, Integer studentId, HttpServletRequest request){
        List<QuestionPaper> questionPapers = paperService.paperQueryALlQuestionByIdOrderByType(paperId);
        List<String> ans=new ArrayList<>();
        List<String> RightAns=new ArrayList<>();

        return "redirect:/exam/toExam";
    }
    /**
     * 考试后台
     * */
    //查看所有考试安排后台
    @RequestMapping("/getAllExam")
    public String getAllExam(Model model){
        List<Exam> Exams = examService.getAllS();
        model.addAttribute("Exams",Exams);
        return "exam/backexamlist";
    }


}
