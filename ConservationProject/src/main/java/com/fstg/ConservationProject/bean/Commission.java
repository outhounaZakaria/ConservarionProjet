package com.fstg.ConservationProject.bean;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Commission {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	private String numCommission;
	@OneToMany
	private List<Dossier> dossiers ;
	private Date dateCommission;
	private String heurDepartCommission;
	private String heurFintCommission;
	public Commission(Long id, String numCommission, List<Dossier> dossiers, Date dateCommission,
			String heurDepartCommission, String heurFintCommission) {
		super();
		this.id = id;
		this.numCommission = numCommission;
		this.dossiers = dossiers;
		this.dateCommission = dateCommission;
		this.heurDepartCommission = heurDepartCommission;
		this.heurFintCommission = heurFintCommission;
	}
	public Commission() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumCommission() {
		return numCommission;
	}
	public void setNumCommission(String numCommission) {
		this.numCommission = numCommission;
	}
	public List<Dossier> getDossiers() {
		return dossiers;
	}
	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}
	public Date getDateCommission() {
		return dateCommission;
	}
	public void setDateCommission(Date dateCommission) {
		this.dateCommission = dateCommission;
	}
	public String getHeurDepartCommission() {
		return heurDepartCommission;
	}
	public void setHeurDepartCommission(String heurDepartCommission) {
		this.heurDepartCommission = heurDepartCommission;
	}
	public String getHeurFintCommission() {
		return heurFintCommission;
	}
	public void setHeurFintCommission(String heurFintCommission) {
		this.heurFintCommission = heurFintCommission;
	}
	
	
}
