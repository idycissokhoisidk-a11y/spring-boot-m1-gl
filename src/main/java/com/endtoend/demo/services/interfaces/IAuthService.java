package com.endtoend.demo.services.interfaces;

import com.endtoend.demo.dto.AuthRequest;
import com.endtoend.demo.dto.AuthResponse;
import com.endtoend.demo.dto.RegisterRequest;

public interface IAuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse authenticate(AuthRequest request);
}
