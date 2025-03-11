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
@Table(name = "kich_thuoc")
public class KichThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "ma_kich_thuoc", nullable = false, length = 50)
    private String maKichThuoc;

    @Size(max = 20)
    @NotNull
    @Nationalized
    @Column(name = "\"size\"", nullable = false, length = 20)
    private String size;

    @NotNull
    @Column(name = "rong_ao", nullable = false)
    private Double rongAo;

    @NotNull
    @Column(name = "dai_ao", nullable = false)
    private Double daiAo;

    @NotNull
    @Column(name = "rong_vai", nullable = false)
    private Double rongVai;

    @NotNull
    @Column(name = "dai_tay", nullable = false)
    private Double daiTay;

    @NotNull
    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = false;

}