package com.farhan.staradmin.service.impl;

import com.farhan.staradmin.entity.HoaDonChiTiet;
import com.farhan.staradmin.repository.HoaDonChiTietRepo;
import com.farhan.staradmin.service.HoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonChiTietServiceImpl implements HoaDonChiTietService {

    @Autowired
    HoaDonChiTietRepo hoaDonChiTietRepo;

    @Override
    public List<HoaDonChiTiet> getListHoaDonChiTiet() {
        return hoaDonChiTietRepo.findAll();
    }
}
