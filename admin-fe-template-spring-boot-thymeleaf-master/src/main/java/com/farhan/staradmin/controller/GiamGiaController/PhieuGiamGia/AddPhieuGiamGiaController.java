package com.farhan.staradmin.controller.GiamGiaController.PhieuGiamGia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddPhieuGiamGiaController {
    @GetMapping("/ADDphieuGiamGia")
    public String show(){

        return "pages/QuanLyGiamGia/PhieuGiamGiaView/AddPhieuGiamGia";
    }
}
