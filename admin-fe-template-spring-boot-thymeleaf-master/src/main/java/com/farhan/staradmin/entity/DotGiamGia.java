package com.farhan.staradmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "dot_giam_gia")
public class DotGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_dot_giam_gia", length = 10)
    private String maDotGiamGia;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_dot_giam_gia", length = 50)
    private String tenDotGiamGia;

    @Column(name = "ngay_bat_dau")
    private Date ngayBatDau;

    @Column(name = "ngay_ket_thuc")
    private Date ngayKetThuc;

    @Column(name = "gia_tri")
    private Integer giaTri;

    @Column(name = "trang_thai")
    private Integer trangThai;

    public String getGiaTri() {
        if (giaTri <= 100) { // Giả sử <= 100 là %
            return giaTri + "%";
        }
        return giaTri + "%";
    }
}