package com.app.service;

import java.util.List;

import com.app.dto.TouristDTO;

public interface TouristService {
	TouristDTO createTourist(TouristDTO tourist);

	List<TouristDTO> getTouristByBId(Long bookingId);

	List<TouristDTO> getAllTourist();

}
