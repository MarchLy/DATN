package com.farhan.staradmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class ChiTietSanPhamDto {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ma_anh", length = 10)
    private String maAnh;

    @Column(name = "ten_chi_tiet_sp", nullable = false)
    private String tenChiTietSp;

    @Column(name = "ma_chi_tiet_sp", nullable = false, length = 50)
    private String maChiTietSp;

    @NotNull
    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @NotNull
    @Column(name = "don_gia", nullable = false, precision = 18, scale = 2)
    private BigDecimal donGia;
}
