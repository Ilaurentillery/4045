package com.goldenretriever;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoldenController {
	@RequestMapping("/Home")
	public String start() {
		return "Home";
	}
}
