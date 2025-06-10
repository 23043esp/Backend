package com.tp_ansible.essay.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tp_ansible.essay.entiry.House;
import com.tp_ansible.essay.repo.HouseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HouseService {

	private final HouseRepository repo;
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	
	public List<House> getAvailableHouses() {
		List<House> availableHouses = repo.findAll()
				.stream()
				.filter(h -> h.getAvailable()!=0)
				.toList();
		return availableHouses;
	}
	
	public void save(House ...houses)
	{
		for (House h : houses) {
			repo.save(h);
			LOG.info("Saved {}",h.getCode());
		}
	}
}
