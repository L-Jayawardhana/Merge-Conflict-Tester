package org.example.mergeconflicttester.Mapper;

import org.example.mergeconflicttester.DTO.CreateUserDTO;
import org.example.mergeconflicttester.DTO.UserResponseDTO;
import org.example.mergeconflicttester.Model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toEntity(CreateUserDTO createUserDTO) {
        User user = new User();
        user.setUsername(createUserDTO.getUsername());
        return user;
    }

    public UserResponseDTO toResponseDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setUserId(user.getUserId());
        dto.setUsername(user.getUsername());
        return dto;
    }
}
