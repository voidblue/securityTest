package com.example.security.app;

import com.example.security.domain.User;
import com.example.security.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User find(final Integer id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("no"));
    }
}
