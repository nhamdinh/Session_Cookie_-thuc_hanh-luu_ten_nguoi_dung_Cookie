package com.loginCookie.service;

import com.loginCookie.model.UserAccount;
import com.loginCookie.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserAccountServiceImpl implements UserAccountService {
    @Autowired
    private UserAccountRepository userAccountRepository;
    @Override
    public Iterable<UserAccount> findAll() {
        return userAccountRepository.findAll();
    }
}