package kr.ac.kopo.bookshop1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

	@GetMapping("/")
	public String index()throws Exception {
		return "index";
	}
}
