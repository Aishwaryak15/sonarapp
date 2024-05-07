package com.cybage.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.boot.models.DomainModel;

public interface DomainRepository extends JpaRepository<DomainModel, Integer> {
	 DomainModel findByDomainName(String domainName);
}
