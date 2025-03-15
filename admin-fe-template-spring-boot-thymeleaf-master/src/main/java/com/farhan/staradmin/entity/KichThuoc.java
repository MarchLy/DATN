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

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "kich_thuoc")
public class KichThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_kich_thuoc", length = 10)
    private String maKichThuoc;

    @Size(max = 10)
    @Nationalized
    @Column(name = "\"size\"", length = 10)
    private String size;

    @Column(name = "rong_ao", precision = 18, scale = 2)
    private BigDecimal rongAo;

    @Column(name = "dai_ao", precision = 18, scale = 2)
    private BigDecimal daiAo;

    @Column(name = "rong_vai", precision = 18, scale = 2)
    private BigDecimal rongVai;

    @Column(name = "dai_tay", precision = 18, scale = 2)
    private BigDecimal daiTay;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}