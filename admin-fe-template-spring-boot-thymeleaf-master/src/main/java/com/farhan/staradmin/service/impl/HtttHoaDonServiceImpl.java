package com.farhan.staradmin.service.impl;

import com.farhan.staradmin.entity.HtttHoaDon;
import com.farhan.staradmin.repository.HtttHoaDonRepo;
import com.farhan.staradmin.service.HtttHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HtttHoaDonServiceImpl implements HtttHoaDonService {
    @Autowired
    HtttHoaDonRepo htttHoaDonRepo;

    @Override
    public List<HtttHoaDon> getListHtttHoaDon() {
        return htttHoaDonRepo.findAll();
    }
}
