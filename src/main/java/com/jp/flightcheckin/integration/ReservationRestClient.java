package com.jp.flightcheckin.integration;

import com.jp.flightcheckin.integration.dto.Reservation;
import com.jp.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);
}
