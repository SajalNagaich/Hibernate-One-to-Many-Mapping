package com.infosys.clientname.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class University {
	@Id
	private int id;
	private String name;
	private String address;
//	@Cascade(CascadeType.ALL)
	
	@OneToMany
	private List<College> colleges;

//	public String toString() {
//		return "University [id=" + id + ", name=" + name + ", address=" + address+ "]";
//	}
	
	
	
}
