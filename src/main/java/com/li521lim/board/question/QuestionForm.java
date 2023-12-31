package com.li521lim.board.question;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
	@NotEmpty(message="タイトルは必須です")
	@Size(max=200)
	private String subject;
	
	@NotEmpty(message="内容は必須です")
	private String content;
}
