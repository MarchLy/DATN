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
    private Hang idHang;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_chat_lieu", nullable = false)
    private ChatLieu idChatLieu;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_kich_thuoc", nullable = false)
    private KichThuoc idKichThuoc;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_mau_sac", nullable = false)
    private MauSac idMauSac;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_thuong_hieu", nullable = false)
    private ThuongHieu idThuongHieu;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_xuat_xu", nullable = false)
    private XuatXu idXuatXu;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_nha_san_xuat", nullable = false)
    private NhaSanXuat idNhaSanXuat;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_san_pham", nullable = false)
    private SanPham idSanPham;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_khuy_ao", nullable = false)
    private KhuyAo idKhuyAo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_co_ao", nullable = false)
    private CoAo idCoAo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_tay_ao", nullable = false)
    private TayAo idTayAo;

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

    @Size(max = 255)
    @Nationalized
    @Column(name = "hinh_anh")
    private String hinhAnh;

    @NotNull
    @Column(name = "trang_thai", nullable = false)
    private Boolean trangThai = false;

}