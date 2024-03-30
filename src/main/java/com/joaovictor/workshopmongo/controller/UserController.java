package com.joaovictor.workshopmongo.controller;

import com.joaovictor.workshopmongo.domain.User;
import com.joaovictor.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAll(){
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
