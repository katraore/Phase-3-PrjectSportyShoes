package com.sportyshoes.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.sportyshoes.entity.PurchaseReportEntity;
import com.sportyshoes.entity.ShoeEntity;
import com.sportyshoes.repository.PurchaseReportRepository;
import com.sportyshoes.repository.ShoesRepository;
import com.sportyshoes.service.SportyShoesService;

@Service
public class ShoesService implements SportyShoesService {
	
	@Autowired
	ShoesRepository shoesRepository;
	
	@Autowired
	PurchaseReportRepository purchaseReportRepository;

	@Override
	public void addShoe(ShoeEntity shoe) {
		shoesRepository.save(shoe);
	}

	@Override
	public ShoeEntity getShoe(int id) {
		
		return shoesRepository.findById(id).get() ;
	}

	@Override
	public void updateShoe(int id, ShoeEntity shoe) {
		if(shoesRepository.findById(id).isPresent())
		{
			ShoeEntity oldShoeEntity = shoesRepository.findById(id).get();
			oldShoeEntity.setName(shoe.getName());
			oldShoeEntity.setCategory(shoe.getCategory());
			oldShoeEntity.setPrice(shoe.getPrice());
			shoesRepository.save(oldShoeEntity);
			
		}
		
	}

	@Override
	public void deleteShoe(int id) {
		shoesRepository.deleteById(id);
		
	}

	@Override
	public List<ShoeEntity> getAllShoes() {
		return shoesRepository.findAll();
	}

	@Override
	public List<ShoeEntity> getAllShoesByCategory(String category) {
		return shoesRepository.findByCategory(category);
	}

	@Override
	public void addReport(PurchaseReportEntity report) {
		purchaseReportRepository.save(report);
		
	}

	@Override
	public PurchaseReportEntity getReport(int pid) {
		return purchaseReportRepository.findById(pid).get();
	}

	@Override
	public void updateReport(int pid, PurchaseReportEntity report) {
		if(purchaseReportRepository.findById(pid).isPresent())
		{
			PurchaseReportEntity oldPurchaseReportEntity = purchaseReportRepository.findById(pid).get();
			oldPurchaseReportEntity.setCategory(report.getCategory());
			oldPurchaseReportEntity.setDop(report.getDop());
			purchaseReportRepository.save(oldPurchaseReportEntity);
		}
		
	}

	@Override
	public void deleteReport(int pid) {
		purchaseReportRepository.deleteById(pid);
		
	}

	@Override
	public List<PurchaseReportEntity> getAllReports() {
		return purchaseReportRepository.findAll();
	}

	@Override
	public List<PurchaseReportEntity> getAllReportsByDOP(Date dop) {
		return purchaseReportRepository.findAllReportsByDOP(dop);
	}

	@Override
	public List<PurchaseReportEntity> getAllReportsByCategory(String category) {
		return purchaseReportRepository.findAllReportsByCategory(category);
	}
	
	
}
