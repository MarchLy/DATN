package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.Hang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangRepo extends JpaRepository<Hang, Integer> {
}
