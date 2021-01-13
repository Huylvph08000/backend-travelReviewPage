package com.acazia.travelreview.controllers;

import com.acazia.travelreview.dto.TravelPlaceDTO;
import com.acazia.travelreview.exeption.RecordNotFoundException;
import com.acazia.travelreview.models.TravelPlace;
import com.acazia.travelreview.repository.TravelPlaceRepository;
import com.acazia.travelreview.security.services.TravelPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@Autowired
	TravelPlaceRepository travelPlaceRepository;
	private TravelPlaceService travelPlaceService;
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
	public String userAccess() {
		return "User Content.";
	}
	@GetMapping("/mod")
	@PreAuthorize("hasRole('MODERATOR')")
	public String moderatorAccess() {
		return "Moderator Board.";
	}
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return "Admin Board.";
	}
	@GetMapping("/travelplaces")
	public List<TravelPlace> getAllTravelPlaces(){
		return travelPlaceRepository.findAll();
	}
	// tim kiem theo ten
	@GetMapping("/travelplaces/name/{name}")
	public TravelPlace findByName(@PathVariable("name") String name){
		return travelPlaceRepository.findByName(name);
	}
   //	tao moi
	@PostMapping("/travelplaces")
	public void createPlace(@RequestBody TravelPlace travelPlace){
//		return travelPlaceRepository.createPost(travelPlaceDTO.toEntity());
		 this.travelPlaceService.createPost(travelPlace);
	}
}
