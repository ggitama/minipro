package com.minipro207.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.minipro207.model.BiodataModel;
import com.minipro207.viewmodel.viewCariPelamar;

public interface BiodataRepository extends JpaRepository<BiodataModel, Integer> {
//	@Query(value = "SELECT p FROM BiodataModel p where lower (fullname) like %?1%")
//	List<viewCariPelamar> PlmrByName(String fullname);

//	@Query(value = "SELECT p.fullname FROM BiodataModel p where p.fullname = ?1")
//	String CekNama(String fullname);

	@Query(value = "SELECT new com.minipro207.viewmodel.viewCariPelamar (p.fullname, p.nickname, p.email, p.phonenumber1, d.major, d.schoolname, p.id) FROM BiodataModel p LEFT JOIN PendidikanModel d ON p.id = d.biodataid where p.isdelete=false")
	public List<viewCariPelamar> viewPelamar();
	
	@Query(value = "SELECT new com.minipro207.viewmodel.viewCariPelamar (p.fullname, p.nickname, p.email, p.phonenumber1, d.major, d.schoolname, p.id) FROM BiodataModel p LEFT JOIN PendidikanModel d ON p.id = d.biodataid where lower (fullname) like %?1%  and p.isdelete=false")
	List<viewCariPelamar> PlmrByName(String fullname);
	
	@Query(value = "SELECT new com.minipro207.viewmodel.viewCariPelamar (p.fullname, p.nickname, p.email, p.phonenumber1, d.major, d.schoolname, p.id) FROM BiodataModel p LEFT JOIN PendidikanModel d ON p.id = d.biodataid where p.fullname = ?1 and p.isdelete=false")
	String CekNama(String fullname);

	@Modifying
	@Query("update BiodataModel b set b.fullname = ?1 where b.id = ?2")
	int updateFullname(String fullname, Long id);
}
	