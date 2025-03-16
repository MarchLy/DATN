package com.farhan.staradmin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "danh_gia")
public class DanhGia {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_spct")
    private ChiTietSanPham idSpct;

    @Column(name = "so_sao", precision = 18, scale = 2)
    private BigDecimal soSao;

    @Size(max = 200)
    @Nationalized
    @Column(name = "binh_luan", length = 200)
    private String binhLuan;

    @Column(name = "ngay_danh_gia")
    private Instant ngayDanhGia;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}