package com.tp_ansible.essay.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp_ansible.essay.entiry.House;
import com.tp_ansible.essay.service.HouseService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/houses")
public class HouseController {

	private final HouseService serv;
	@GetMapping
	public ResponseEntity<List<House>> getHouses()
	{
		List<House> houses = serv.getAvailableHouses();
		return (houses.isEmpty() ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
			    new ResponseEntity<>(houses,HttpStatus.OK));
	}
}
