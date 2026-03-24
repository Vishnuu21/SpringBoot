package com.example.AxiosBackendExample;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @CrossOrigin(origins = "http://localhost:5173/")
    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("Helloo....... :/", "My name is Vishnu");
    }

    static class HelloResponse {
        public String message, description;

        public HelloResponse(String message, String description) {
            this.message = message;
            this.description = description;
        }

    }
}
