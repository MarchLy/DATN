package com.farhan.staradmin.controller.GiamGiaController.PhieuGiamGia;

import com.farhan.staradmin.entity.PhieuGiamGia;
import com.farhan.staradmin.service.GiamGia.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PhieuGiamGiaController {
    @Autowired
    private PhieuGiamGiaService phieuGiamGiaService;

    @GetMapping("add-phieu-giam-gia")
    public String chuyenTrangAdd(Model model) {
        model.addAttribute("pgg", new PhieuGiamGia()); // Khởi tạo object trước khi render form
        return "pages/QuanLyGiamGia/PhieuGiamGiaView/AddPhieuGiamGia";
    }

    @GetMapping("/phieu-giam-gia")
    public String phieuGiamGia(Model model, @ModelAttribute("pgg") PhieuGiamGia phieuGiamGia) {
        model.addAttribute("listPgg", phieuGiamGiaService.findAll());
        return "pages/QuanLyGiamGia/PhieuGiamGiaView/PhieuGiamGia";
    }

    @PostMapping("/xoa-phieu-giam-gia/{id}")
    public String xoaPhieu(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        boolean deleted = phieuGiamGiaService.deletePgg(id);
        if (deleted) {
            redirectAttributes.addFlashAttribute("success", "Xóa thành công!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Xóa thất bại! Phiếu giảm giá không tồn tại hoặc đang được sử dụng.");
        }
        return "redirect:/phieu-giam-gia";
    }

    @PostMapping("add-phieu")
    public String addPhieu(Model model, @ModelAttribute("pgg") PhieuGiamGia pgg) {
        phieuGiamGiaService.addPgg(pgg);
        return "redirect:/phieu-giam-gia";
    }
}
