package com.NVDabbewala.rest.webservices.restfulwebservices.pojos;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
//We have included ToString.Exclude to avoid recursion
//@Table(name = "bill")
public class Bill  implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bill_id")
	private Integer billID;

	@Column(name = "bill_amount", nullable = false, scale = 2) // Scale means digits after decimal point
	private double billAmount;
	
	@Column(name = "due_amount", nullable = false, scale = 2)
	private double dueAmount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate billDate;
	
//	@Column(name = "payment_status",columnDefinition = "TINYINT", length = 1,nullable = false)
//	@Column(name = "payment_status",columnDefinition = "BOOLEAN")
	@Column(columnDefinition = "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean paymentStatus=false;

	@ManyToOne
	@JoinColumn(name = "student_id")
	@ToString.Exclude
	private Student studentId;

		
	
}
