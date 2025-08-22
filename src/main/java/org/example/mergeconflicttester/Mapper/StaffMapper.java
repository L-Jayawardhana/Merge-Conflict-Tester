package org.example.mergeconflicttester.Mapper;

import org.example.mergeconflicttester.DTO.StaffResponseDTO;
import org.example.mergeconflicttester.Model.Staff;
import org.springframework.stereotype.Component;

@Component
public class StaffMapper {

    public StaffResponseDTO toResponseDTO(Staff staff) {
        StaffResponseDTO dto = new StaffResponseDTO();
        dto.setStaffId(staff.getStaffId());
        dto.setUserId(staff.getUserId());
        return dto;
    }
}
