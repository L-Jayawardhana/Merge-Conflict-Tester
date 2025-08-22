package org.example.mergeconflicttester.Service;

import org.example.mergeconflicttester.DTO.StaffResponseDTO;
import org.example.mergeconflicttester.Mapper.StaffMapper;
import org.example.mergeconflicttester.Model.Staff;
import org.example.mergeconflicttester.Repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StaffService {

    private final StaffRepo staffRepo;
    private final StaffMapper staffMapper;

    @Autowired
    public StaffService(StaffRepo staffRepo, StaffMapper staffMapper) {
        this.staffRepo = staffRepo;
        this.staffMapper = staffMapper;
    }

    public List<StaffResponseDTO> getAllStaff() {
        List<Staff> staffList = staffRepo.findAll();
        return staffList.stream()
                .map(staffMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
}
