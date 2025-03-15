package com.farhan.staradmin.repository;

import com.farhan.staradmin.entity.KichThuoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KichThuocRepo extends JpaRepository<KichThuoc, Integer> {
}
