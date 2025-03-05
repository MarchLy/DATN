package com.farhan.staradmin.controller.thongKeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ThongKeController {
    @GetMapping("/thongKe")
    public String show(){
        return "pages/ThongKe/ThongKe";
    }
}
