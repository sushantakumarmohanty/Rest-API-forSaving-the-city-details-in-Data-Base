package com.trisysitSpringBootBase.city;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface CityService {

	City saveCity(City city);

	List<City> getCities();

}
