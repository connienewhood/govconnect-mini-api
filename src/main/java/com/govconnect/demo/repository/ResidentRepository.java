package com.govconnect.demo.repository;

import com.govconnect.demo.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResidentRepository extends JpaRepository<Resident, Long> {
    List<Resident> findByIsPaidFalse();
}