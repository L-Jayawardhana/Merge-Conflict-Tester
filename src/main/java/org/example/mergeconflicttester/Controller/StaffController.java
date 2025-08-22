package org.example.mergeconflicttester.Controller;

import org.example.mergeconflicttester.DTO.CreateStaffDTO;
import org.example.mergeconflicttester.DTO.StaffResponseDTO;
import org.example.mergeconflicttester.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/staff")
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public ResponseEntity<List<StaffResponseDTO>> getAllStaff() {
        List<StaffResponseDTO> staffList = staffService.getAllStaff();
        return ResponseEntity.ok(staffList);
    }
}
