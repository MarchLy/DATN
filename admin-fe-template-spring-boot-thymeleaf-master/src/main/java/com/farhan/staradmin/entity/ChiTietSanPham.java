package com.farhan.staradmin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "chi_tiet_san_pham")
public class ChiTietSanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_hang", nullable = false)
    private Hang hang;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_chat_lieu", nullable = false)
    private ChatLieu chatLieu;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_kich_thuoc", nullable = false)
    private KichThuoc kichThuoc;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_mau_sac", nullable = false)
    private MauSac mauSac;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_thuong_hieu", nullable = false)
    private ThuongHieu thuongHieu;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_xuat_xu", nullable = false)
    private XuatXu xu;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_nha_san_xuat", nullable = false)
    private NhaSanXuat nhaSanXuat;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_san_pham", nullable = false)
    private SanPham sanPham;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_khuy_ao", nullable = false)
    private KhuyAo khuyAo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_co_ao", nullable = false)
    private CoAo coAo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_tay_ao", nullable = false)
    private TayAo tayAo;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "ma_chi_tiet_sp", nullable = false, length = 50)
    private String maChiTietSp;

    @Size(max = 255)
    @NotNull
    @Nationalized
    @Column(name = "ten_chi_tiet_sp", nullable = false)
    private String tenChiTietSp;

    @NotNull
    @Column(name = "so_luong", nullable = false)
    private Integer soLuong;

    @NotNull
    @Column(name = "don_gia", nullable = false, precision = 18, scale = 2)
    private BigDecimal donGia;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ghi_chu")
    private String ghiChu;

    @Column(name = "trang_thai")
    private Boolean trangThai;

    @ManyToOne
    @JoinColumn(name = "id_hinh_anh")
    private HinhAnh hinhAnh;

    @ManyToOne
    @JoinColumn(name = "id_danh_muc")
    private DanhMuc danhMuc;

}