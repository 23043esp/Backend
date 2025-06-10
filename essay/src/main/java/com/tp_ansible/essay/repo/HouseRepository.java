package com.tp_ansible.essay.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tp_ansible.essay.entiry.House;

public interface HouseRepository extends JpaRepository<House, Integer> {

}
