package com.farhan.staradmin.controller.GiamGiaController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GiamGiaController {
    @GetMapping("/giamGia")
    public String show(){
        return "pages/QuanLyGiamGia/QuanLyGiamGia";
    }
}
