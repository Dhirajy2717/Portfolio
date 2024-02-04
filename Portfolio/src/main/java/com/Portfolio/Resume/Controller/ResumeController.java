package com.Portfolio.Resume.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {
	
	@RequestMapping("indexCall")
	public String indexCall() {
		return "index";
	}

}
