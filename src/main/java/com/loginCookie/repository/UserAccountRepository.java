package com.loginCookie.repository;

import com.loginCookie.model.UserAccount;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserAccountRepository extends PagingAndSortingRepository<UserAccount,Integer> {
}
