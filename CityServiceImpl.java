package com.trisysitSpringBootBase.city;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.trisysitSpringBootBase.util.Constants;
@Component
public class CityServiceImpl implements CityService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CityRepository cityRepository;

	@Override
	public City saveCity(City city) {
		return cityRepository.save(city);
	}

	@Override
	public List<City> getCities() {
		return cityRepository.findByStatus(Constants.STATUS_ACTIVE);
	}
}
