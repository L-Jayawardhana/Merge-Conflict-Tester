package org.example.mergeconflicttester.DTO;

public class CreateUserDTO {
    private String username;

    public CreateUserDTO(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
