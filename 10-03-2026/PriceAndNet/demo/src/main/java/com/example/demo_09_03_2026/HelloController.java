package com.example.demo_09_03_2026;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String hello() {
		return "Hello world";
	}

	@GetMapping("/add")
	public String addNum(@RequestParam int a, @RequestParam int b) {
		return "Sum:" + (a + b);
	}

	@GetMapping("/sub/{a}/{b}") // in here -> ("/sub/{a}_{b} after {a} i think you can give any operator gpt
								// gave / but i modified to _ andd it worked
	public String subNum(@PathVariable int a, @PathVariable int b) {
		return "Sub:" + (a - b);
	}

	@PostMapping("/divide")
	public String divideNum(@RequestBody Numbers numbers) {
		return "Divide: " + (numbers.getA() / numbers.getB());
	}

	@PostMapping("/multiply")
	public String multiplyNum(@RequestParam int a, @RequestParam int b) {
		return "Multiply: " + (a * b);
	}

	@PostMapping("/student")
	public String stdDetails(@RequestBody Students std) {
		int tot = std.getM1() + std.getM2() + std.getM3();
		return "Sum of marks: " + tot + "\nMean: " + tot / 3;
	}

}
