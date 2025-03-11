package com.farhan.staradmin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "ma_nsx", nullable = false, length = 50)
    private String maNsx;

    @Size(max = 255)
    @NotNull
    @Nationalized
    @Column(name = "ten_nsx", nullable = false)
    private String tenNsx;

    @Size(max = 255)
    @NotNull
    @Nationalized
    @Column(name = "dia_chi", nullable = false)
    private String diaChi;

    @NotNull
    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = false;

}