package com.farhan.staradmin.controller.hoaDonController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HoaDonController {
    @GetMapping("/hoaDon")
    public String show(){

        return "pages/DanhSachHoaDon/QuanLyHoaDon";
    }
}
