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
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "ma_sp", nullable = false, length = 50)
    private String maSp;

    @Size(max = 255)
    @NotNull
    @Nationalized
    @Column(name = "ten_sp", nullable = false)
    private String tenSp;

    @NotNull
    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @Size(max = 255)
    @NotNull
    @Nationalized
    @Column(name = "mo_ta", nullable = false)
    private String moTa;

    @NotNull
    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = false;

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", maSp='" + maSp + '\'' +
                ", tenSp='" + tenSp + '\'' +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa + '\'' +
                ", trangThai=" + trangThai +
                '}';
    }
}