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
@Table(name = "mau_sac")
public class MauSac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = false;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_mau", length = 10)
    private String maMau;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_mau", length = 50)
    private String tenMau;

}