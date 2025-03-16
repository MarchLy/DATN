package com.farhan.staradmin.service.impl;

import com.farhan.staradmin.entity.HoaDon;
import com.farhan.staradmin.repository.HoaDonRepo;
import com.farhan.staradmin.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    @Autowired
    HoaDonRepo hoaDonRepo;

    @Override
    public Page<HoaDon> searchHoaDon(String maHoaDon, String trangThai, Date fromDate, Date toDate, Pageable pageable) {
        Integer trangThaiInt = null;

        if (trangThai != null && !trangThai.isEmpty()) {
            try {
                trangThaiInt = Integer.parseInt(trangThai);
            } catch (NumberFormatException e) {
                trangThaiInt = null; // Hoặc xử lý lỗi phù hợp
            }
        }

        return hoaDonRepo.searchHoaDon(maHoaDon, trangThaiInt, fromDate, toDate, pageable);
    }

    @Override
    public HoaDon detailHoaDon(Integer id) {
        return hoaDonRepo.findById(id).orElse(null);
    }

    @Override
    public void updateHoaDon(HoaDon hoaDon) {
        hoaDonRepo.save(hoaDon);
    }
}
