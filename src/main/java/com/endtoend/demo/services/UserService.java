package com.endtoend.demo.services;

import com.endtoend.demo.dto.UserDTO;
import com.endtoend.demo.entity.User;
import com.endtoend.demo.exceptions.ResourceNotFoundException;
import com.endtoend.demo.mappers.UserMapper;
import com.endtoend.demo.repositories.UserRepository;
import com.endtoend.demo.services.interfaces.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDTO getUserByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return userMapper.toDTO(user);
    }

    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return userMapper.toDTO(user);
    }
}
