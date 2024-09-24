package com.test.SpringAPI.service;

import com.test.SpringAPI.model.Login;

import java.util.Optional;

public interface LoginService {
    Login addUser(Login login);
    Optional<Login> getUser(String username);
}
