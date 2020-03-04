package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@NoArgsConstructor
@Entity
@Table(name = "cdac_branch")
public class CDACBranch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4344085783919667139L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "branch_id")
	private Integer branchId;

//	@Column(name = "branch_name")
	private String branchName;

	
//	@Column(name = "course_start")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate courseStart;

	
//	@Column(name = "course_end")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate courseEnd;
	
//its forward part of reference so it will apply on collection type.
	@JsonManagedReference
	@OneToMany(mappedBy = "branchId",orphanRemoval = true)
	@ToString.Exclude
	private List<Student> studentList; 

}
