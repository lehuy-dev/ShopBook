package com.shopbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping({"/","index"})
	public String Home() {
		return "abc";
	}
}
