package com.farhan.staradmin.service;

import com.farhan.staradmin.entity.MauSac;
import com.farhan.staradmin.entity.SanPham;
import com.farhan.staradmin.repository.MauSacRepo;
import com.farhan.staradmin.repository.SanPhamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MauSacService {
    @Autowired
    MauSacRepo mauSacRepo;

    public Page<MauSac> getAllMauSac(int page, int size) {
        return mauSacRepo.findAll(PageRequest.of(page, size));
    }
}
