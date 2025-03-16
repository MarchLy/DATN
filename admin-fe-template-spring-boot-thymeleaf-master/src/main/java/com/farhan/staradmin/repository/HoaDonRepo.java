package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.HoaDon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface HoaDonRepo extends JpaRepository<HoaDon, Integer> {
    //    Page<HoaDon> findAll(Pageable pageable);
    @Query("SELECT h FROM HoaDon h WHERE " +
            "(:maHoaDon IS NULL OR h.maHoaDon LIKE %:maHoaDon%) AND " +
            "(:trangThai IS NULL OR h.trangThai = :trangThai) AND " +
            "(:fromDate IS NULL OR h.ngayTao >= :fromDate) AND " +
            "(:toDate IS NULL OR h.ngayTao <= :toDate) " +
            "ORDER BY h.ngayTao DESC")
    Page<HoaDon> searchHoaDon(@Param("maHoaDon") String maHoaDon,
                              @Param("trangThai") Integer trangThai,
                              @Param("fromDate") Date fromDate,
                              @Param("toDate") Date toDate,
                              Pageable pageable);
}
