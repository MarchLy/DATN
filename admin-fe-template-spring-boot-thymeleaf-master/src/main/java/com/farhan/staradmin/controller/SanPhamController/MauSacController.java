package com.farhan.staradmin.controller.SanPhamController;

import com.farhan.staradmin.entity.MauSac;
import com.farhan.staradmin.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mau-sac")
public class MauSacController {

    @Autowired
    MauSacService mauSacService;

    @GetMapping("/hien-thi")
    public String listMauSac(Model model,
                              @RequestParam(defaultValue = "0") int page,
                              @RequestParam(defaultValue = "5") int size) {
        Page<MauSac> mauSacPage = mauSacService.getAllMauSac(page, size);
        model.addAttribute("listMauSac", mauSacPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", mauSacPage.getTotalPages());
        return "/pages/QuanLySanPham/mau-sac";
    }
}
