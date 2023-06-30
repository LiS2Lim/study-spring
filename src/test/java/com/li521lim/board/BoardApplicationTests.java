package com.li521lim.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.li521lim.board.question.Question;
import com.li521lim.board.question.QuestionRepository;
import com.li521lim.board.question.QuestionService;

@SpringBootTest
class BoardApplicationTests {
	
	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
	}

}
