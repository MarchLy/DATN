package com.farhan.staradmin.controller.hoaDonController;

import com.farhan.staradmin.entity.HoaDon;
import com.farhan.staradmin.repository.LichSuHoaDonDtoRepo;
import com.farhan.staradmin.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private KhachHangService khachHangService;

    @Autowired
    private HoaDonChiTietService hoaDonChiTietService;

    @Autowired
    private HtttHoaDonService htttHoaDonService;

    @Autowired
    private LichSuHoaDonService lichSuHoaDonService;


    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping("/hoaDon/hien-thi")
    public String hienThi(Model model,
                          @RequestParam(defaultValue = "0") int page,
                          @RequestParam(defaultValue = "5") int size,
                          @RequestParam(required = false) String maHoaDon,
                          @RequestParam(required = false) String trangThai,
                          @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
                          @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate) {

        Pageable pageable = PageRequest.of(page, size);
        Page<HoaDon> hoaDonPage = hoaDonService.searchHoaDon(maHoaDon, trangThai, fromDate, toDate, pageable);

        model.addAttribute("listHoaDon", hoaDonPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", hoaDonPage.getTotalPages());

        // Giữ lại thông tin tìm kiếm
        model.addAttribute("maHoaDon", maHoaDon);
        model.addAttribute("trangThai", trangThai);
        model.addAttribute("fromDate", fromDate != null ? new SimpleDateFormat("yyyy-MM-dd").format(fromDate) : "");
        model.addAttribute("toDate", toDate != null ? new SimpleDateFormat("yyyy-MM-dd").format(toDate) : "");

        return "pages/DanhSachHoaDon/QuanLyHoaDon.html";
    }



    @GetMapping("hoaDon/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model) {
        HoaDon hoaDon = hoaDonService.detailHoaDon(id);
        model.addAttribute("hoaDon", hoaDon);
        model.addAttribute("listLichSuHoaDonDto", lichSuHoaDonService.getListLichSuHoaDonDto(id));
        model.addAttribute("listDanhSachSanPham",chiTietSanPhamService.getDanhSachSanPham(id));
        return "pages/DanhSachHoaDon/HoaDonChiTiet.html";
    }

}
