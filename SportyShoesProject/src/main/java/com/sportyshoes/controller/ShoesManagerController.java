package com.sportyshoes.controller;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.entity.PurchaseReportEntity;
import com.sportyshoes.entity.ShoeEntity;
import com.sportyshoes.service.impl.ShoesService;

@RestController
@RequestMapping(path="/mang")
public class ShoesManagerController {
	
	@Autowired
	ShoesService shoesService;
	
	@RequestMapping("/allshoes")
	public List<ShoeEntity> getAllShoes()
	{
		return shoesService.getAllShoes();
	}
	
	@RequestMapping("/allshoes/{category}")
	public List<ShoeEntity> getAllShoesByCategory(@PathVariable String category)
	{
		return shoesService.getAllShoesByCategory(category);
	}
	
	@RequestMapping("/allreports")
	public List<PurchaseReportEntity> getAllReport()
	{
		return shoesService.getAllReports();
	}
	
	@RequestMapping("/allreports/{category}")
	public List<PurchaseReportEntity> getAllReportsByCategory(@PathVariable String category)
	{
		return shoesService.getAllReportsByCategory(category);
	}
	
	@RequestMapping("/allreports/{dop}")
	public List<PurchaseReportEntity> getAllReportsByDOP(@PathVariable Date dop)
	
	{
		return shoesService.getAllReportsByDOP(dop);
	}

}
