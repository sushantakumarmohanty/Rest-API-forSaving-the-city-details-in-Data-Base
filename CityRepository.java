package com.trisysitSpringBootBase.city;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, String>,JpaSpecificationExecutor<City>{
	List<City> findByStatus(String status);

}
