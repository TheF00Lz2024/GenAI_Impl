package com.test.SpringAPI.service;

import com.test.SpringAPI.model.Login;
import com.test.SpringAPI.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public Login addUser(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public Optional<Login> getUser(String username) {
        return loginRepository.findByUsername(username);
    }
}