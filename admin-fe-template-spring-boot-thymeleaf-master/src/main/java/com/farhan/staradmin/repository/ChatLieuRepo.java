package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.ChatLieu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatLieuRepo extends JpaRepository<ChatLieu, Integer> {
}
