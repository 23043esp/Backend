package com.tp_ansible.essay.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numberDoors;
	private String color;
	private String code;
	private int available;
}
