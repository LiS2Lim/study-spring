package com.li521lim.board.answer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.li521lim.board.question.Question;
import com.li521lim.board.question.QuestionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
	
	private final QuestionService questionService;
	private final AnswerService answerService;
	
	@PostMapping("/create/{id}")
	public String createAnswer(Model model, @PathVariable("id") Integer id, @RequestParam String content) {
		System.out.println("it is working");
		Question question = this.questionService.getQuestion(id);
		this.answerService.create(question, content);
		return String.format("redirect:/question/detail/%s", id);
	}
}
