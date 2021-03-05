package com.trisysitSpringBootBase.city;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
/**
 * Basically controller is responsible for what type of request we need to implements depend upon the scenarios of front end.  
 * @author trisys
 *
 */
@RequestMapping("/api/city")
public interface CityController {
	@PostMapping("/save")
	ResponseEntity<?> createCity(@Valid @RequestBody City city);

	@GetMapping("/getCities")
	ResponseEntity<?> getCities();
}
