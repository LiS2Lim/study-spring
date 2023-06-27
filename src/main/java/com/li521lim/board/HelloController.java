package com.li521lim.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	//初期ページ
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
