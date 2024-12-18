package com.infosys.clientname.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class College {
	
	@Id
	private int id;
	private String name;
	private String city;
	private String type;
}
