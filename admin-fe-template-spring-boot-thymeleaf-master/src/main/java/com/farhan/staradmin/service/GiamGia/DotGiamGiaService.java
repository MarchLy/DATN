package com.farhan.staradmin.service.GiamGia;

import com.farhan.staradmin.entity.DotGiamGia;
import com.farhan.staradmin.repository.GiamGia.DotGiamGiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DotGiamGiaService {
    @Autowired
    private DotGiamGiaRepo dotGiamGiaRepo;

    //findAll trangThai = 1
    public List<DotGiamGia> findAll() {
        return dotGiamGiaRepo.findAllActive();
    }
}
