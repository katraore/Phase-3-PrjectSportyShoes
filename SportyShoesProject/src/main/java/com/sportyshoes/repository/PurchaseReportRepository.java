package com.sportyshoes.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.entity.PurchaseReportEntity;

public interface PurchaseReportRepository extends JpaRepository<PurchaseReportEntity, Integer> {

	public List<PurchaseReportEntity> findAllReportsByDOP(Date dop);

	public List<PurchaseReportEntity> findAllReportsByCategory(String category);



}
