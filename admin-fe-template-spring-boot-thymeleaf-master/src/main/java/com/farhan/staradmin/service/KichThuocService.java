package com.farhan.staradmin.service;

import com.farhan.staradmin.repository.KichThuocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KichThuocService {
    @Autowired
    KichThuocRepo kichThuocRepo;
}
