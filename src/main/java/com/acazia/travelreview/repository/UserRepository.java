package com.acazia.travelreview.repository;

import com.acazia.travelreview.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
