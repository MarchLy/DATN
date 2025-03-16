package com.farhan.staradmin.service;

import com.farhan.staradmin.entity.LichSuHoaDon;
import com.farhan.staradmin.entity.LichSuHoaDonDto;
import com.farhan.staradmin.service.impl.LichSuHoaDonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface LichSuHoaDonService {

    List<LichSuHoaDon> getListLichSuHoaDon();
    List<LichSuHoaDonDto> getListLichSuHoaDonDto(int id); // Thay đổi từ getLichSuHoaDonById
}
