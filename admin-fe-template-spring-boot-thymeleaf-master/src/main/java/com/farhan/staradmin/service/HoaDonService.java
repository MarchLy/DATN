package com.farhan.staradmin.service;

import com.farhan.staradmin.entity.HoaDon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface HoaDonService {

    //    Page<HoaDon> getListHoaDon(int page, int size);
    Page<HoaDon> searchHoaDon(String maHoaDon, String trangThai, Date fromDate, Date toDate, Pageable pageable);

    HoaDon detailHoaDon(Integer id);

    void updateHoaDon(HoaDon hoaDon);

}
