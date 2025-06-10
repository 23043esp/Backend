package com.tp_ansible.essay.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tp_ansible.essay.entiry.House;
import com.tp_ansible.essay.service.HouseService;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class StartWithTheseHouses {
	
	private final HouseService serv;
	@Bean
	CommandLineRunner start() {
		return args -> {
			House pennyHouse = new House(12, 9, "White", "0XD556", 1);
			House concilHouse = new House(13,4,"Red","CC001",1);
			House smartHouse = new House(14,8,"Gray","SS001",0);
			House fulaHouse = new House(15,1,"Yellow-grayish","Tiba",1);
			serv.save(pennyHouse,concilHouse,smartHouse,
					fulaHouse);
		};
	}
}
