package com.farhan.staradmin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonChiTiet {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "id_ctsp")
    private ChiTietSanPham chiTietSanPham;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_hdct", length = 10)
    private String maHdct;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "gia", precision = 18, scale = 2)
    private BigDecimal gia;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}