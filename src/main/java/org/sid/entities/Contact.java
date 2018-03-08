package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contact implements Serializable {

	@Id @GeneratedValue 
	private long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateBorn;
	private String email;
	private String tel;
	private String pictures;
	
	public Contact() {
		super();
	}
	
	public Contact(String nom, String prenom, Date dateBorn, String email, String tel, String pictures) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateBorn = dateBorn;
		this.email = email;
		this.tel = tel;
		this.pictures = pictures;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Date getDateBorn() {
		return dateBorn;
	}
	
	public void setDateBorn(Date dateBorn) {
		this.dateBorn = dateBorn;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getPictures() {
		return pictures;
	}
	
	public void setPictures(String pictures) {
		this.pictures = pictures;
	}
	
}
