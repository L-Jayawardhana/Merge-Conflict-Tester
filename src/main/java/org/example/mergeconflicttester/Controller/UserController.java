package org.example.mergeconflicttester.Controller;

import org.example.mergeconflicttester.DTO.CreateUserDTO;
import org.example.mergeconflicttester.DTO.UserResponseDTO;
import org.example.mergeconflicttester.Mapper.UserMapper;
import org.example.mergeconflicttester.Model.User;
import org.example.mergeconflicttester.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> addUser(@RequestBody CreateUserDTO createUserDTO) {
        UserResponseDTO response = userService.addUser(createUserDTO);
        return ResponseEntity.status(201).body(response);
    }
}
