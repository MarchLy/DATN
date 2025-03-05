package com.farhan.staradmin.controller.BanHangController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BanHangController {
    @GetMapping("/BanHangTQ")
    public String show(){
        return "pages/BanHangTaiQuay/BanHangTaiQuay";
    }
}
