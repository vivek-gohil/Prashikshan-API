package com.prashikshan.main.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.prashikshan.main.dto.UserRequestDTO;
import com.prashikshan.main.dto.UserResponseDTO;
import com.prashikshan.main.entity.User;
import com.prashikshan.main.exception.ResourceNotFoundException;
import com.prashikshan.main.mapper.UserMapper;
import com.prashikshan.main.repository.UserRepository;
import com.prashikshan.main.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

   @Override
   public UserResponseDTO login(UserRequestDTO userRequestDTO) {
       User user = UserMapper.mapUserRequestDTOToUser(userRequestDTO, new User());
       Optional<User> existingUser = userRepository.findByUserIdAndPassword(user.getUserId(), user.getPassword());
       if(existingUser.isPresent()){
        return UserMapper.mapUserToUserResponseDTO(existingUser.get(), new UserResponseDTO());
       }
       else{
        throw new ResourceNotFoundException("User", "UserId", "" +userRequestDTO.getUserId());
       }
   }
}
