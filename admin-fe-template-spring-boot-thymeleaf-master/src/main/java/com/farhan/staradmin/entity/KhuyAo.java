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
@Table(name = "khuy_ao")
public class KhuyAo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_khuy_ao", length = 10)
    private String maKhuyAo;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_khuy_ao", length = 50)
    private String tenKhuyAo;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}