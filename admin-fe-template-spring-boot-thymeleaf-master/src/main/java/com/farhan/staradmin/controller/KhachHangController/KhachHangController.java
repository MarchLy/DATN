package com.farhan.staradmin.controller.KhachHangController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @GetMapping("/hien-thi")
    public String show(){
        return "pages/QuanLyKhachHang/quan-ly-khach-hang";
    }
    @GetMapping("/add")
    public String add(){
        return "pages/QuanLyKhachHang/them-khach-hang";
    }
}
