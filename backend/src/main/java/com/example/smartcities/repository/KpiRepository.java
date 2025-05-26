package com.example.smartcities.repository;

import com.example.smartcities.model.KpiStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface KpiRepository extends JpaRepository<KpiStatus, Long> {
    List<KpiStatus> findByTipo(String tipo);
}
