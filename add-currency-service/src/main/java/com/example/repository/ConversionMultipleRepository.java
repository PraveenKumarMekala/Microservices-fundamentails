package com.example.repository;

import com.example.domain.ConversionMultiple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversionMultipleRepository extends JpaRepository<ConversionMultiple, Integer> {
}
