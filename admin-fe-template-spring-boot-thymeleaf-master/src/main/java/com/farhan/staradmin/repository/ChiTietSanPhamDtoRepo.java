package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.ChiTietSanPhamDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChiTietSanPhamDtoRepo extends JpaRepository<ChiTietSanPhamDto, Integer> {

    @Query(value = "SELECT h.ma_anh, c.ten_chi_tiet_sp, c.ma_chi_tiet_sp, c.so_luong, c.don_gia, hd.id " +
            "FROM chi_tiet_san_pham c " +
            "JOIN hoa_don hd ON c.id = hd.id " +
            "JOIN hoa_don_chi_tiet hct ON c.id = hct.id_ctsp AND hd.id = hct.id_hoa_don " +
            "JOIN san_pham sp ON c.id_san_pham = sp.id " +
            "JOIN hinh_anh h ON c.id_hinh_anh = h.id " +
            "WHERE hd.id = :id", nativeQuery = true)
    List<ChiTietSanPhamDto> getDanhSachSanPham(@Param("id") int id);

}
