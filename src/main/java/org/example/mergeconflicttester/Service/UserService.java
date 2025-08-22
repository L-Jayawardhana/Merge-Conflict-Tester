package org.example.mergeconflicttester.Service;

import org.example.mergeconflicttester.DTO.CreateUserDTO;
import org.example.mergeconflicttester.DTO.UserResponseDTO;
import org.example.mergeconflicttester.Mapper.UserMapper;
import org.example.mergeconflicttester.Model.User;
import org.example.mergeconflicttester.Model.Staff;
import org.example.mergeconflicttester.Repository.UserRepo;
import org.example.mergeconflicttester.Repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepo userRepo;
    private final StaffRepo staffRepo;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepo userRepo, StaffRepo staffRepo, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.staffRepo = staffRepo;
        this.userMapper = userMapper;
    }

    @Transactional
    public UserResponseDTO addUser(CreateUserDTO createUserDTO) {
        // Create and save user first
        User user = userMapper.toEntity(createUserDTO);
        User savedUser = userRepo.save(user);

        // Create staff entry with only user ID - no other fields
        Staff staff = new Staff();
        staff.setUserId(savedUser);
        // firstName will be null since it's optional now
        staffRepo.save(staff);

        return userMapper.toResponseDTO(savedUser);
    }
}
