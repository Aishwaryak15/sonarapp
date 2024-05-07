package com.cybage.boot.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "applied_event_table")
public class AppliedEventInfoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applId;
	private int custId;
	private int eventId;
	public int getApplId() {
		return applId;
	}
	public void setApplId(int applId) {
		this.applId = applId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
}
