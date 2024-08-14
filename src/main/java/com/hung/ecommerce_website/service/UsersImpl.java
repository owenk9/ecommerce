package com.hung.ecommerce_website.service;

import com.hung.ecommerce_website.entity.Users;
import com.hung.ecommerce_website.repo.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersImpl implements UsersService{
    private final UsersRepository usersRepository;
    private final PasswordEncoder encoder;
//    @Override
//    public Users save(Users users) {
//        users.setPassword(encoder.encode(users.getPassword()));
//        return usersRepository.save(users);
//    }
}
