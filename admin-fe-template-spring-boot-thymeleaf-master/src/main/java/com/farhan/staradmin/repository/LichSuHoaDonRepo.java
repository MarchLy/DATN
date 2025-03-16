package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.LichSuHoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichSuHoaDonRepo extends JpaRepository<LichSuHoaDon, Integer> {
}
