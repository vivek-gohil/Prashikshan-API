package com.prashikshan.main.mapper;

import com.prashikshan.main.dto.UserRequestDTO;
import com.prashikshan.main.dto.UserResponseDTO;
import com.prashikshan.main.entity.User;

public class UserMapper {

    private UserMapper() {

    }
    public static UserResponseDTO mapUserToUserResponseDTO(User user , UserResponseDTO userResponseDTO) {
        userResponseDTO.setUserId(user.getUserId());
        userResponseDTO.setRole(user.getRole());
        return userResponseDTO;
    }

    public static User mapUserRequestDTOToUser(UserRequestDTO userRequestDTO,User user){
        user.setUserId(userRequestDTO.getUserId());
        user.setPassword(userRequestDTO.getPassword());
        return user;
    }

}
