package com.trisysitSpringBootBase.city;

import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.trisysitSpringBootBase.util.Constants;

@RestController
public class CityControllerImpl implements CityController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CityService cityService;

	@Override
	public ResponseEntity<?> createCity(City city) {
		city.setId(UUID.randomUUID().toString());
		city.setStatus(Constants.STATUS_ACTIVE);

		return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getCities() {
		return new ResponseEntity<>(cityService.getCities(), HttpStatus.OK);
	}

}
