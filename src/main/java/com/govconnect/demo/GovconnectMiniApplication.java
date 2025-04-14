package com.govconnect.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.govconnect.demo")
public class GovconnectMiniApplication {

	public static void main(String[] args) {
		SpringApplication.run(GovconnectMiniApplication.class, args);
	}
}

// ✅ Add this test controller here
@RestController
class TestController {
    @GetMapping("/test")
    public String test() {
        return "It works!";
    }
}
