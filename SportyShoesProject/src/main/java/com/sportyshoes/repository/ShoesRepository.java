package com.sportyshoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sportyshoes.entity.ShoeEntity;

public interface ShoesRepository extends JpaRepository<ShoeEntity, Integer> {
	public List<ShoeEntity> findByCategory(String category);

}
