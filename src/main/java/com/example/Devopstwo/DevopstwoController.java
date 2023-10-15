package com.example.Devopstwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopstwoController {
	@GetMapping(value="/gets")
	public String getName() {
		return "I'm not home, so please leave a message.";
	}

}
