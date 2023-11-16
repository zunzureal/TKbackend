package com.swuzunzuapp.fullstackbackend.repository;

import com.swuzunzuapp.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
