package com.farhan.staradmin.controller.GiamGiaController.DotGiamGiaController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DotGiamGiaController {
@GetMapping("/dotGiamGia")
public String show(){

    return "pages/QuanLyGiamGia/DotGiamGiaView/DotGiamGia";
}
}
