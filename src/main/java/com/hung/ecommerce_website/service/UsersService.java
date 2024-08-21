package com.hung.ecommerce_website.service;

import com.hung.ecommerce_website.auth.ChangePasswordRequest;
import com.hung.ecommerce_website.entity.user.Users;
import com.hung.ecommerce_website.repo.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final PasswordEncoder passwordEncoder;
    private final UsersRepository repository;
    public void changePassword(ChangePasswordRequest request, Principal connectedUsers) {
        var user = (Users) ((UsernamePasswordAuthenticationToken) connectedUsers).getPrincipal();
        // check if the current password is correct
        if(!passwordEncoder.matches(request.getCurrentPassword(), user.getPassword())){
            throw new IllegalStateException("Wrong password");
        }

        // check if the two new password the same
        if(!request.getNewPassword().equals(request.getConfirmationPassword())){
            throw new IllegalStateException("Password are not the same");
        }
        // update the password
        user.setPassword(passwordEncoder.encode(request.getNewPassword()));
        //save the new password
        repository.save(user);
    }
}
