package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/cro")
public class CroController {

	@Value("${message:poda}")
	private String message;

	@RequestMapping("/msg")
	public String message() {
		return message;
	}
}
