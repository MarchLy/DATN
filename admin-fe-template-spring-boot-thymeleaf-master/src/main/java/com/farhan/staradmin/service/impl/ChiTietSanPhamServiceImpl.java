package com.farhan.staradmin.service.impl;

import com.farhan.staradmin.entity.ChiTietSanPham;
import com.farhan.staradmin.entity.ChiTietSanPhamDto;
import com.farhan.staradmin.repository.ChiTietSanPhamDtoRepo;
import com.farhan.staradmin.repository.ChiTietSanPhamRepo;
import com.farhan.staradmin.service.ChiTietSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietSanPhamServiceImpl implements ChiTietSanPhamService {
    @Autowired
    ChiTietSanPhamRepo chiTietSanPhamRepo;

    @Autowired
    ChiTietSanPhamDtoRepo chiTietSanPhamDtoRepo;

    @Override
    public List<ChiTietSanPham> getListChiTietSanPham() {
        return chiTietSanPhamRepo.findAll();
    }

    @Override
    public List<ChiTietSanPhamDto> getDanhSachSanPham(int id){
        return chiTietSanPhamDtoRepo.getDanhSachSanPham(id);
    }
}
