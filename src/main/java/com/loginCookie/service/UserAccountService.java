package com.loginCookie.service;

import com.loginCookie.model.UserAccount;

public interface UserAccountService {
    Iterable<UserAccount> findAll();
}
