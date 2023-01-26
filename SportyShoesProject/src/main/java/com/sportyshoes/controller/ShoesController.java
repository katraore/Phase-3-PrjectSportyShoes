package com.sportyshoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.entity.PurchaseReportEntity;
import com.sportyshoes.entity.ShoeEntity;
import com.sportyshoes.service.impl.ShoesService;

@RestController
@RequestMapping(path="/webapi")
public class ShoesController {
	
	@Autowired
	ShoesService shoesService;
	
	@RequestMapping(method = RequestMethod.POST, value="/shoe")
	public void addShoe(@RequestBody ShoeEntity shoe)
	{
		shoesService.addShoe(shoe);
	}
	
	@RequestMapping("/shoe/{id}")
	public ShoeEntity getShoe(@PathVariable int id)
	{
		return shoesService.getShoe(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/shoe/{id}")
	public void updateShoe(@RequestBody ShoeEntity shoe, @PathVariable int id)
	{
		shoesService.updateShoe(id, shoe);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/shoe/{id}")
	public void deleteShoe (@PathVariable int id)
	{
		shoesService.deleteShoe(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/report")
	public void addReport(@RequestBody PurchaseReportEntity report)
	{
		shoesService.addReport(report);
	}
	
	@RequestMapping("/report/{pid}")
	public PurchaseReportEntity getReport(@PathVariable int pid)
	{
		return shoesService.getReport(pid);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/report/{pid}")
	public void updateReport(@RequestBody PurchaseReportEntity report, @PathVariable int pid)
	{
		shoesService.updateReport(pid, report);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/report/{pid}")
	public void deleteReport(@PathVariable int pid)
	{
		shoesService.deleteReport(pid);
	}
		

}
