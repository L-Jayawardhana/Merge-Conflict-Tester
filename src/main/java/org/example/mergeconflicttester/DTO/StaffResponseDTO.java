package org.example.mergeconflicttester.DTO;

import org.example.mergeconflicttester.Model.User;

public class StaffResponseDTO {

    private Long staffId;
    private User userId;

    public StaffResponseDTO() {
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }


    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
