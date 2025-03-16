package com.farhan.staradmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "hinh_anh")
public class HinhAnh {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @Nationalized
    @Column(name = "ma_anh", length = 10)
    private String maAnh;

    @Size(max = 50)
    @Nationalized
    @Column(name = "ten_anh", length = 50)
    private String tenAnh;

    @Column(name = "trang_thai")
    private Boolean trangThai;

}