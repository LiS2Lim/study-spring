package com.li521lim.board.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
	@NotEmpty(message = "内容は必須です")
	private String content;
}
