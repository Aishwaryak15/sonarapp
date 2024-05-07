package com.cybage.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cybage.boot.models.PdfDocument;

//@Repository
public interface PdfDocumentRepository extends JpaRepository<PdfDocument, Long> {
	public PdfDocument findByUserId(int userId);
}
