package com.example.demo11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public TestModel get(){
		return new TestModel("Test Generated");
	}
}
