package com.minipro207.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "x_riwayat_pendidikan")
public class PendidikanModel {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "created_by",nullable=false)
	private Long createdby;
	@Column(name = "created_on",nullable=false)
	private Date createdon;
	@Column(name = "modified_by",nullable=true)
	private Long modifiedby;
	@Column(name = "modified_on",nullable=true)
	private Date modifiedon;
	@Column(name = "deleted_by",nullable=true)
	private Long deletedby;
	@Column(name = "deleted_on",nullable=true)
	private Date deletedon;
	@Column(name = "is_delete",nullable=false)
	private boolean isdelete;
	@Column(name = "biodata_id",nullable=false)
	private Long biodataid;
	@Column(name = "school_name",nullable=true)
	private String schoolname;
	@Column(name = "city",nullable=true)
	private String city;
	@Column(name = "country",nullable=true)
	private String country;
	@Column(name = "education_level_id",nullable=true)
	private Long edcationlevelid;
	@Column(name = "entry_year",nullable=true)
	private String entryyear;
	@Column(name = "graduation_year",nullable=true)
	private String graduationyear;
	@Column(name = "major",nullable=true)
	private String major;
	@Column(name = "gpa",nullable=true)
	private double gpa;
	@Column(name = "notes",nullable=true)
	private String notes;
	@Column(name = "order",nullable=true)
	private Integer order;
	@Column(name = "judul_ta",nullable=true)
	private String judulta;
	@Column(name = "deskripsi_ta",nullable=true)
	private String deskripsita;
	
	
	@ManyToOne
	   @JoinColumn(name="biodata_id", referencedColumnName="id", nullable=true, updatable=false, insertable=false)
	   private BiodataModel pddm;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getCreatedby() {
		return createdby;
	}


	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}


	public Date getCreatedon() {
		return createdon;
	}


	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}


	public Long getModifiedby() {
		return modifiedby;
	}


	public void setModifiedby(Long modifiedby) {
		this.modifiedby = modifiedby;
	}


	public Date getModifiedon() {
		return modifiedon;
	}


	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}


	public Long getDeletedby() {
		return deletedby;
	}


	public void setDeletedby(Long deletedby) {
		this.deletedby = deletedby;
	}


	public Date getDeletedon() {
		return deletedon;
	}


	public void setDeletedon(Date deletedon) {
		this.deletedon = deletedon;
	}


	public boolean isIsdelete() {
		return isdelete;
	}


	public void setIsdelete(boolean isdelete) {
		this.isdelete = isdelete;
	}


	public Long getBiodataid() {
		return biodataid;
	}


	public void setBiodataid(Long biodataid) {
		this.biodataid = biodataid;
	}


	public String getSchoolname() {
		return schoolname;
	}


	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Long getEdcationlevelid() {
		return edcationlevelid;
	}


	public void setEdcationlevelid(Long edcationlevelid) {
		this.edcationlevelid = edcationlevelid;
	}


	public String getEntryyear() {
		return entryyear;
	}


	public void setEntryyear(String entryyear) {
		this.entryyear = entryyear;
	}


	public String getGraduationyear() {
		return graduationyear;
	}


	public void setGraduationyear(String graduationyear) {
		this.graduationyear = graduationyear;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	public Integer getOrder() {
		return order;
	}


	public void setOrder(Integer order) {
		this.order = order;
	}


	public String getJudulta() {
		return judulta;
	}


	public void setJudulta(String judulta) {
		this.judulta = judulta;
	}


	public String getDeskripsita() {
		return deskripsita;
	}


	public void setDeskripsita(String deskripsita) {
		this.deskripsita = deskripsita;
	}


	public BiodataModel getPddm() {
		return pddm;
	}


	public void setPddm(BiodataModel pddm) {
		this.pddm = pddm;
	}


	
}
