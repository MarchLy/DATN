package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.ChiTietSanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietSanPhamRepo extends JpaRepository<ChiTietSanPham, Integer> {
}
