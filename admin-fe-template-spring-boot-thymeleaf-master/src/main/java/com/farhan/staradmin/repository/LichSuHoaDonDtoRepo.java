package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.LichSuHoaDonDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LichSuHoaDonDtoRepo extends JpaRepository<LichSuHoaDonDto, Integer> {

    @Query(value = "SELECT hd.id, httthd.ma_giao_dich, hd.tong_tien, hd.ngay_thanh_toan, httt.ten_hinh_thuc, httthd.trang_thai, nv.ho_ten " +
            "FROM hoa_don hd " +
            "JOIN httt_hoa_don httthd ON hd.id = httthd.id_hoa_don " +
            "JOIN hinh_thuc_thanh_toan httt ON httthd.id_httt = httt.id " +
            "JOIN nhan_vien nv ON hd.id_nhan_vien = nv.id " +
            "WHERE hd.id = :id", nativeQuery = true)
    List<LichSuHoaDonDto> getListLichSuHoaDonDto(@Param("id") int id);

//    LichSuHoaDonDto findById(int id);
}
