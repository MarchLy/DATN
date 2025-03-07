package com.farhan.staradmin.controller.TraHangController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TraHangController {
    @GetMapping("/traHang")
    public String show(){
        return "pages/TraHang/TraHang";
    }
}
