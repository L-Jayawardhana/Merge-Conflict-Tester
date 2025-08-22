package org.example.mergeconflicttester.Mapper;

import org.example.mergeconflicttester.DTO.CreateUserDTO;
import org.example.mergeconflicttester.DTO.UserResponseDTO;
import org.example.mergeconflicttester.Model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    /**
     * Converts CreateUserDTO to User entity
     * @param createUserDTO the DTO containing user creation data
     * @return User entity
     */
    public User toEntity(CreateUserDTO createUserDTO) {
        if (createUserDTO == null) {
            return null;
        }

        User user = new User();
        user.setUsername(createUserDTO.getUsername());
        user.setPassword(createUserDTO.getPassword());
        user.setEmail(createUserDTO.getEmail());
        user.setRole(createUserDTO.getRole());
        return user;
    }

    /**
     * Converts User entity to UserResponseDTO
     * @param user the User entity
     * @return UserResponseDTO for API responses
     */
    public UserResponseDTO toResponseDTO(User user) {
        if (user == null) {
            return null;
        }

        UserResponseDTO responseDTO = new UserResponseDTO();
        responseDTO.setUserId(user.getUserId());
        responseDTO.setUsername(user.getUsername());
        responseDTO.setEmail(user.getEmail());
        responseDTO.setRole(user.getRole());
        return responseDTO;
    }
}
