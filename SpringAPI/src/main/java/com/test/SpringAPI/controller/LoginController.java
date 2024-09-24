package com.test.SpringAPI.controller;

import com.test.SpringAPI.model.Login;
import com.test.SpringAPI.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logins")
public class LoginController {
    private final LoginService loginService;
    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
    @PostMapping
    public ResponseEntity<Login> createLogin(@RequestBody Login login) {
        return new ResponseEntity<>(loginService.addUser(login), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Login> getLoginByUsername(@PathVariable String username) {
        return new ResponseEntity<>(loginService.getUser(username).get(), HttpStatus.OK);
    }
}

