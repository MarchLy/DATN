package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.KichThuoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KichThuocRepo extends JpaRepository<KichThuocRepo, Integer> {
    Page<KichThuoc> findAllKichThuoc(Pageable pageable);

}
