package com.farhan.staradmin.controller.SanPhamController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/san-pham")
public class SanPhamController {
    @GetMapping("/hien-thi")
    public String hienThi() {
        return "/pages/QuanLySanPham/QuanLySanPham";
    }
}
