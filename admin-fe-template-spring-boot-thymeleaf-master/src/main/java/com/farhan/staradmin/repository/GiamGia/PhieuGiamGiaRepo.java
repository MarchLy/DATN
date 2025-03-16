package com.farhan.staradmin.repository.GiamGia;

import com.farhan.staradmin.entity.PhieuGiamGia;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhieuGiamGiaRepo extends JpaRepository<PhieuGiamGia, Integer> {
    // Hien thi danh sach pgg co trang thai = 1
    @Query("SELECT p FROM PhieuGiamGia p WHERE p.trangThai = true")
    List<PhieuGiamGia> findAllActive();

    // Xoa mem pgg
    @Modifying
    @Transactional
    @Query("UPDATE PhieuGiamGia p SET p.trangThai = false WHERE p.id = :id")
    int deletePgg(@Param("id") Integer id);
}
