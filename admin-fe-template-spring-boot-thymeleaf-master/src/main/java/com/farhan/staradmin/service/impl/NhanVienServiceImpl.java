package com.farhan.staradmin.service.impl;

import com.farhan.staradmin.entity.NhanVien;
import com.farhan.staradmin.repository.NhanVienRepo;
import com.farhan.staradmin.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    NhanVienRepo nhanVienRepo;

    @Override
    public List<NhanVien> getListNhanVien(){
        return nhanVienRepo.findAll();
    };
}
