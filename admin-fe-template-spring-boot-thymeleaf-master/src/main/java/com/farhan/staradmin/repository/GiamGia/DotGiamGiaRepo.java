package com.farhan.staradmin.repository.GiamGia;

import com.farhan.staradmin.entity.DotGiamGia;
import com.farhan.staradmin.entity.PhieuGiamGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DotGiamGiaRepo extends JpaRepository<DotGiamGia, Integer> {
    @Query("SELECT p FROM DotGiamGia p WHERE p.trangThai = 1")
    List<DotGiamGia> findAllActive();
}
