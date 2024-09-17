package com.extension.queixa.repository;

import com.extension.queixa.model.Queixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueixaRepository extends JpaRepository<Queixa, Long> {
}