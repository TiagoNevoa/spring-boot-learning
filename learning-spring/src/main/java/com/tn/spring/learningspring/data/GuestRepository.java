package com.tn.spring.learningspring.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}