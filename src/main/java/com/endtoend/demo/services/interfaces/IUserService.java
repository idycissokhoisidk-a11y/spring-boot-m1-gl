package com.endtoend.demo.services.interfaces;

import com.endtoend.demo.dto.UserDTO;

public interface IUserService {
    UserDTO getUserByEmail(String email);
    UserDTO getUserById(Long id);
}
