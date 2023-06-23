package com.li521lim.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa() {
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		
		Question q = all.get(0);
		assertEquals("what is this board ?", q.getSubject());
	}

}
