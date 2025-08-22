package org.example.mergeconflicttester.Repository;

import org.example.mergeconflicttester.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
