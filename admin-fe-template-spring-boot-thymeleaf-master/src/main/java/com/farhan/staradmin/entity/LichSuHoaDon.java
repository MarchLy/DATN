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

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "lich_su_hoa_don")
public class LichSuHoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hoa_don")
    private HoaDon idHoaDon;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_lshd", length = 10)
    private String maLshd;

    @Size(max = 100)
    @Nationalized
    @Column(name = "hanh_dong_nguoi_thao_tac", length = 100)
    private String hanhDongNguoiThaoTac;

    @Size(max = 100)
    @Nationalized
    @Column(name = "ly_do_huy", length = 100)
    private String lyDoHuy;

    @Column(name = "ngay_cap_nhat")
    private Instant ngayCapNhat;

    @Size(max = 100)
    @Nationalized
    @Column(name = "ghi_chu", length = 100)
    private String ghiChu;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}