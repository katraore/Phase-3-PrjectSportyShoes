package com.sportyshoes.service;

import java.util.Date;
import java.util.List;

import com.sportyshoes.entity.PurchaseReportEntity;
import com.sportyshoes.entity.ShoeEntity;

public interface SportyShoesService {
	public void  addShoe(ShoeEntity shoe);
	public ShoeEntity getShoe(int id);
	public void updateShoe(int id, ShoeEntity shoe);
	public void deleteShoe(int id);
	public List<ShoeEntity> getAllShoes();
	public List<ShoeEntity> getAllShoesByCategory(String category);
	
	
	public void addReport(PurchaseReportEntity report);
	public PurchaseReportEntity getReport(int pid);
	public void updateReport(int pid, PurchaseReportEntity report);
	public void deleteReport(int pid);
	public List<PurchaseReportEntity> getAllReports();
	public List<PurchaseReportEntity> getAllReportsByDOP(Date dop);
	public List<PurchaseReportEntity> getAllReportsByCategory(String category);

}
