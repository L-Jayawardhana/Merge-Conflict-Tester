package org.example.mergeconflicttester.Repository;

import org.example.mergeconflicttester.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff, Long> {
}
