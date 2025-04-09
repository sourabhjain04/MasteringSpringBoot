package com.example.demoJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoJPA.entities.Job;

public interface JobRepository  extends JpaRepository<Job, Long>{
	
	

}
