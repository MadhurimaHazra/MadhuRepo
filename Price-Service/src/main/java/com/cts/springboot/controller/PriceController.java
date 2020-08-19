package com.cts.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
	
	@ResponseBody
	@GetMapping("/helloprice")
	public String hello() {
		return "hello world Price";
	}

}
