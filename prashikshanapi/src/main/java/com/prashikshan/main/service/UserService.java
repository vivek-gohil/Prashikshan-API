package com.prashikshan.main.service;

import com.prashikshan.main.dto.UserRequestDTO;
import com.prashikshan.main.dto.UserResponseDTO;

public interface UserService {
    UserResponseDTO login(UserRequestDTO userRequestDTO);
}
