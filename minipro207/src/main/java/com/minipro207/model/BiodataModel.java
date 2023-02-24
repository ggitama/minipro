package com.minipro207.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "x_biodata")
public class BiodataModel {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "created_by", nullable = false)
	private Long createdby;
	@Column(name = "created_on", nullable = false)
	private Date createdon;
	@Column(name = "modified_by", nullable = true)
	private Long modifiedby;
	@Column(name = "modified_on", nullable = true)
	private Date modifiedon;
	@Column(name = "deleted_by", nullable = true)
	private Long deletedby;
	@Column(name = "deleted_on", nullable = true)
	private Date deletedon;
	@Column(name = "is_delete", nullable = false)
	private boolean isdelete;
	@Column(name = "fullname", nullable = false)
	private String fullname;
	@Column(name = "nick_name", nullable = false)
	private String nickname;
	@Column(name = "pob", nullable = false)
	private String pob;
	@Column(name = "dob", nullable = false)
	private Date dob;
	@Column(name = "gender", nullable = false)
	private boolean gender;
	@Column(name = "religion_id", nullable = false)
	private Long religionid;
	@Column(name = "high", nullable = true)
	private int high;
	@Column(name = "weight", nullable = true)
	private int weight;
	@Column(name = "nationality", nullable = true)
	private String nationality;
	@Column(name = "ethnic", nullable = true)
	private String ethnic;
	@Column(name = "hobby", nullable = true)
	private String hobby;
	@Column(name = "identity_type_id", nullable = false)
	private Long identitytypeid;
	@Column(name = "identity_no", nullable = false)
	private String identityno;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "phone_number1", nullable = false)
	private String phonenumber1;
	@Column(name = "phone_number2", nullable = true)
	private String phonenumber2;
	@Column(name = "parent_phone_number", nullable = false)
	private String parentphonenumber;
	@Column(name = "child_sequence", nullable = true)
	private String childsequence;
	@Column(name = "how_many_brothers", nullable = true)
	private String howmanybrothers;
	@Column(name = "marital_status_id", nullable = false)
	private Long maritalstatusid;
	@Column(name = "addrbook_id", nullable = true)
	private Long addrbookid;
	@Column(name = "token", nullable = true)
	private String token;
	@Column(name = "expired_token", nullable = true)
	private Date expiredtoken;
	@Column(name = "marriage_year", nullable = true)
	private String marriageyear;
	@Column(name = "company_id", nullable = false)
	private Long companyid;
	@Column(name = "is_process", nullable = true)
	private boolean isprocess;
	@Column(name = "is_complete", nullable = true)
	private boolean iscomplete;

	@OneToMany(mappedBy="pddm", fetch=FetchType.LAZY)
	   private List<PendidikanModel> pendidikan;

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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Long getReligionid() {
		return religionid;
	}

	public void setReligionid(Long religionid) {
		this.religionid = religionid;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getEthnic() {
		return ethnic;
	}

	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Long getIdentitytypeid() {
		return identitytypeid;
	}

	public void setIdentitytypeid(Long identitytypeid) {
		this.identitytypeid = identitytypeid;
	}

	public String getIdentityno() {
		return identityno;
	}

	public void setIdentityno(String identityno) {
		this.identityno = identityno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber1() {
		return phonenumber1;
	}

	public void setPhonenumber1(String phonenumber1) {
		this.phonenumber1 = phonenumber1;
	}

	public String getPhonenumber2() {
		return phonenumber2;
	}

	public void setPhonenumber2(String phonenumber2) {
		this.phonenumber2 = phonenumber2;
	}

	public String getParentphonenumber() {
		return parentphonenumber;
	}

	public void setParentphonenumber(String parentphonenumber) {
		this.parentphonenumber = parentphonenumber;
	}

	public String getChildsequence() {
		return childsequence;
	}

	public void setChildsequence(String childsequence) {
		this.childsequence = childsequence;
	}

	public String getHowmanybrothers() {
		return howmanybrothers;
	}

	public void setHowmanybrothers(String howmanybrothers) {
		this.howmanybrothers = howmanybrothers;
	}

	public Long getMaritalstatusid() {
		return maritalstatusid;
	}

	public void setMaritalstatusid(Long maritalstatusid) {
		this.maritalstatusid = maritalstatusid;
	}

	public Long getAddrbookid() {
		return addrbookid;
	}

	public void setAddrbookid(Long addrbookid) {
		this.addrbookid = addrbookid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getExpiredtoken() {
		return expiredtoken;
	}

	public void setExpiredtoken(Date expiredtoken) {
		this.expiredtoken = expiredtoken;
	}

	public String getMarriageyear() {
		return marriageyear;
	}

	public void setMarriageyear(String marriageyear) {
		this.marriageyear = marriageyear;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public boolean isIsprocess() {
		return isprocess;
	}

	public void setIsprocess(boolean isprocess) {
		this.isprocess = isprocess;
	}

	public boolean isIscomplete() {
		return iscomplete;
	}

	public void setIscomplete(boolean iscomplete) {
		this.iscomplete = iscomplete;
	}

	public List<PendidikanModel> getPendidikan() {
		return pendidikan;
	}

	public void setPendidikan(List<PendidikanModel> pendidikan) {
		this.pendidikan = pendidikan;
	}


	
	
}
