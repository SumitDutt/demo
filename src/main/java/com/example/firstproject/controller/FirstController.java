package com.example.firstproject.controller;

import com.example.firstproject.bean.Student;
import com.example.firstproject.respose.FirstProectResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/firstproject") // Base path for all endpoints
public class FirstController {

    // GET: http://localhost:8080/firstproject
    @GetMapping
    public FirstProectResponse firstproect() {
        return new FirstProectResponse("Hello, World!");
    }

    // GET:http://localhost:8080/firstproject/Sumit
    //
    @GetMapping("/{name}")
    public FirstProectResponse firstproectParam(@PathVariable String name) {
        return new FirstProectResponse("Hello, " + name);
    }

    // GET: http://localhost:8080/firstproject/request-param?name=Sumit Dutt
    @GetMapping("/request-param")
    public FirstProectResponse firstproectRequestParam(@RequestParam String name) {
        return new FirstProectResponse("Hello, " + name);
    }

    // POST: http://localhost:8080/firstproject
    @PostMapping
    public FirstProectResponse firstproectPost(@RequestBody String name) {
        return new FirstProectResponse("Hello, " + name + "!");
    }

    // POST: http://localhost:8080/firstproject/student      { "name": "Emma Watson1" }
    @PostMapping("/student")
    public FirstProectResponse firstproectStudent(@RequestBody Student student) {
        return new FirstProectResponse("Hello, " + student.getName() + "!");
    }
}
