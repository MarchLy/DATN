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

@Getter
@Setter
@Entity
@Table(name = "nha_san_xuat")
public class NhaSanXuat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_nsx", length = 10)
    private String maNsx;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_nsx", length = 50)
    private String tenNsx;

    @Size(max = 50)
    @Nationalized
    @Column(name = "dia_chi", length = 50)
    private String diaChi;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}