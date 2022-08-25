package aforo255.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String TestFirstJob() {
		return "Welcome to MasterDevops | CARLOS ANGEL 25082022 | LAB FINAL Ansible , AFORO255";
	}
}
