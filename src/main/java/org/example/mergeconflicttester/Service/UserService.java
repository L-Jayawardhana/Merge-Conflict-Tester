package org.example.mergeconflicttester.Service;

import org.example.mergeconflicttester.DTO.CreateUserDTO;
import org.example.mergeconflicttester.DTO.UserResponseDTO;
import org.example.mergeconflicttester.Mapper.UserMapper;
import org.example.mergeconflicttester.Model.User;
import org.example.mergeconflicttester.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepo userRepo, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.userMapper = userMapper;
    }

    public UserResponseDTO addUser(CreateUserDTO createUserDTO) {
        User user = userMapper.toEntity(createUserDTO);
        User savedUser = userRepo.save(user);
        return userMapper.toResponseDTO(savedUser);
    }
}
