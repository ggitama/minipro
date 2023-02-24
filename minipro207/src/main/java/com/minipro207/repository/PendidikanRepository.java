package com.minipro207.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.minipro207.model.PendidikanModel;

public interface PendidikanRepository extends JpaRepository<PendidikanModel, Integer> {
	@Query(value = "SELECT d FROM PendidikanModel d")
	List<PendidikanModel> viewPendidikan();
	
}
