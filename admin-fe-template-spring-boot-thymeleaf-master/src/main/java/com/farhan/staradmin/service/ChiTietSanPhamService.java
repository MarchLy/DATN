package com.farhan.staradmin.service;

import com.farhan.staradmin.entity.ChiTietSanPham;
import com.farhan.staradmin.entity.ChiTietSanPhamDto;

import java.util.List;

public interface ChiTietSanPhamService {
    List<ChiTietSanPham> getListChiTietSanPham();
    List<ChiTietSanPhamDto> getDanhSachSanPham(int id);

}
