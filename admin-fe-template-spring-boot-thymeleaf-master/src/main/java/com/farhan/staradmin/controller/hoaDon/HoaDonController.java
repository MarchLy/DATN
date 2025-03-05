package com.farhan.staradmin.controller.hoaDon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HoaDonController {
    @GetMapping("/hoaDOn")
    public String show(){

        return "pages/DanhSachHoaDon/QuanLyHoaDon";
    }
}
