package com.farhan.staradmin.service.impl;

import com.farhan.staradmin.entity.KhachHang;
import com.farhan.staradmin.repository.KhachHangRepo;
import com.farhan.staradmin.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    KhachHangRepo khachHangRepo;

    @Override
    public List<KhachHang> getListKhachHang() {
        return khachHangRepo.findAll();
    }
}
