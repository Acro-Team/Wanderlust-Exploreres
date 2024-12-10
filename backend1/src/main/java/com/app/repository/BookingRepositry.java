package com.app.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Booking;

public interface BookingRepositry extends JpaRepository<Booking, Long> {

	List<Booking> findByBookingDateBetween(LocalDate startDate, LocalDate endDate);
	
	List<Booking> findByTourDetailsTourId(Long tourId);
	
	List<Booking> findByUserUserId(Long userId);

}