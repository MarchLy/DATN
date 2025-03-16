package com.farhan.staradmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class LichSuHoaDonDto {
    @Id
    @Column(name = "id")
    private Integer id;


    @Column(name = "ma_giao_dich", length = 50)
    private String maGiaoDich;


    @Column(name = "tong_tien", precision = 18, scale = 2)
    private BigDecimal tongTien;

    @Column(name = "ngay_thanh_toan")
    private Date ngayThanhToan;

    @Column(name = "ten_hinh_thuc", length = 50)
    private String tenHinhThuc;

    @Column(name = "trang_thai")
    private Boolean trangThai;

    @Column(name = "ho_ten", length = 100)
    private String hoTen;
}
