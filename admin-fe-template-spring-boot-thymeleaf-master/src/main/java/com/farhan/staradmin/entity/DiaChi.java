package com.farhan.staradmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "dia_chi")
public class DiaChi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_khach_hang")
    private KhachHang idKhachHang;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_dia_chi", length = 10)
    private String maDiaChi;

    @Size(max = 50)
    @Nationalized
    @Column(name = "thanh_pho", length = 50)
    private String thanhPho;

    @Size(max = 50)
    @Nationalized
    @Column(name = "quan_huyen", length = 50)
    private String quanHuyen;

    @Size(max = 50)
    @Nationalized
    @Column(name = "xa_phuong", length = 50)
    private String xaPhuong;

    @Size(max = 10)
    @Nationalized
    @Column(name = "so_nha", length = 10)
    private String soNha;

    @Size(max = 100)
    @Nationalized
    @Column(name = "dia_chi_chi_tiet", length = 100)
    private String diaChiChiTiet;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}