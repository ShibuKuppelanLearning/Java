package com.learning.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import com.learning.java8.trip.Flight;
import com.learning.java8.trip.Journey;
import com.learning.java8.trip.Passenger;
import com.learning.java8.trip.PassengerFlightDetails;
import com.learning.java8.trip.PaxFlightIdentifier;
import com.learning.java8.trip.SpecialServiceRequest;
import com.learning.java8.trip.Trip;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private static final String CONFIRMED = "CONFIRMED";

	private static final String NOT_CONFIRMED = "NOT_CONFIRMED";

	private static final String WCHR = "WCHR";

	private static final String WCMP = "WCMP";

	@Test
	public void testGroupBy() {
		Trip trip = getTripObj();
		System.out.println(trip);
	}

	private Trip getTripObj() {
		Trip trip = new Trip();
		trip.setJourney(getJourneysObj());
		trip.setPassengers(getPassengerListObj());
		trip.setPassengerFlightDetails(getPassengerFlightDetailsObj());
		return trip;
	}

	private List<Journey> getJourneysObj() {
		List<Journey> journeys = new ArrayList<Journey>();
		Journey journey1 = new Journey();
		journey1.setFlights(getJourney1FlightsObj());
		journey1.setJourneyId(getJourney1FlightsObj().stream().map(flight -> flight.getFlightId())
				.reduce((flight1, flight2) -> StringUtils.join(flight1, flight2)).orElse(null));

		Journey journey2 = new Journey();
		journey2.setFlights(getJourney2FlightsObj());
		journey2.setJourneyId(getJourney2FlightsObj().stream().map(flight -> flight.getFlightId())
				.reduce((flight1, flight2) -> StringUtils.join(flight1, flight2)).orElse(null));

		journeys.add(journey1);
		journeys.add(journey2);
		return journeys;
	}

	private List<Flight> getJourney1FlightsObj() {
		List<Flight> flights = new ArrayList<Flight>();
		Flight flight1 = new Flight();
		flight1.setFlightId("COK-DOH");
		Flight flight2 = new Flight();
		flight2.setFlightId("DOH-LHR");
		flights.add(flight1);
		flights.add(flight2);
		return flights;
	}

	private List<Flight> getJourney2FlightsObj() {
		List<Flight> flights = new ArrayList<Flight>();
		Flight flight1 = new Flight();
		flight1.setFlightId("LHR-DOH");
		Flight flight2 = new Flight();
		flight2.setFlightId("DOH-COK");
		flights.add(flight1);
		flights.add(flight2);
		return flights;
	}

	private List<Passenger> getPassengerListObj() {
		List<Passenger> passengers = new ArrayList<>();
		Passenger passenger1 = new Passenger();
		passenger1.setPassengerId("Pax-1");

		Passenger passenger2 = new Passenger();
		passenger2.setPassengerId("Pax-2");

		passengers.add(passenger1);
		passengers.add(passenger2);
		return passengers;
	}

	private List<PassengerFlightDetails> getPassengerFlightDetailsObj() {
		List<PassengerFlightDetails> passengerFlightDetails = new ArrayList<>();

		PassengerFlightDetails passenger1Flight1Details = new PassengerFlightDetails();
		PaxFlightIdentifier pax1Flight1Identifier = new PaxFlightIdentifier();
		pax1Flight1Identifier.setPassengerId(getPassengerListObj().get(0).getPassengerId());
		pax1Flight1Identifier.setFlightId(getJourney1FlightsObj().get(0).getFlightId());
		passenger1Flight1Details.setPaxFlightIdentifier(pax1Flight1Identifier);
		passenger1Flight1Details.setSpecialServiceRequests(getPassenger1Flight1DetailsSSRs());

		PassengerFlightDetails passenger1Flight2Details = new PassengerFlightDetails();
		PaxFlightIdentifier pax1Flight2Identifier = new PaxFlightIdentifier();
		pax1Flight2Identifier.setPassengerId(getPassengerListObj().get(0).getPassengerId());
		pax1Flight2Identifier.setFlightId(getJourney1FlightsObj().get(1).getFlightId());
		passenger1Flight2Details.setPaxFlightIdentifier(pax1Flight2Identifier);
		passenger1Flight2Details.setSpecialServiceRequests(getPassenger1Flight2DetailsSSRs());

		PassengerFlightDetails passenger2Flight3Details = new PassengerFlightDetails();
		PaxFlightIdentifier pax2Flight3Identifier = new PaxFlightIdentifier();
		pax2Flight3Identifier.setPassengerId(getPassengerListObj().get(1).getPassengerId());
		pax2Flight3Identifier.setFlightId(getJourney2FlightsObj().get(0).getFlightId());
		passenger2Flight3Details.setPaxFlightIdentifier(pax2Flight3Identifier);
		passenger2Flight3Details.setSpecialServiceRequests(getPassenger2Flight3DetailsSSRs());

		PassengerFlightDetails passenger2Flight4Details = new PassengerFlightDetails();
		PaxFlightIdentifier pax2Flight4Identifier = new PaxFlightIdentifier();
		pax2Flight4Identifier.setPassengerId(getPassengerListObj().get(1).getPassengerId());
		pax2Flight4Identifier.setFlightId(getJourney2FlightsObj().get(1).getFlightId());
		passenger2Flight4Details.setPaxFlightIdentifier(pax2Flight4Identifier);
		passenger2Flight4Details.setSpecialServiceRequests(getPassenger2Flight4DetailsSSRs());

		passengerFlightDetails.add(passenger1Flight1Details);
		passengerFlightDetails.add(passenger1Flight2Details);
		passengerFlightDetails.add(passenger2Flight3Details);
		passengerFlightDetails.add(passenger2Flight4Details);

		return passengerFlightDetails;
	}

	private List<SpecialServiceRequest> getPassenger1Flight1DetailsSSRs() {
		List<SpecialServiceRequest> specialServiceRequests = new ArrayList<>();
		SpecialServiceRequest ssr1 = new SpecialServiceRequest();
		ssr1.setCode(WCHR);
		ssr1.setStatus(CONFIRMED);
		specialServiceRequests.add(ssr1);

		SpecialServiceRequest ssr2 = new SpecialServiceRequest();
		ssr2.setCode(WCMP);
		ssr2.setStatus(NOT_CONFIRMED);
		specialServiceRequests.add(ssr2);
		return specialServiceRequests;
	}

	private List<SpecialServiceRequest> getPassenger1Flight2DetailsSSRs() {
		List<SpecialServiceRequest> specialServiceRequests = new ArrayList<>();
		SpecialServiceRequest ssr1 = new SpecialServiceRequest();
		ssr1.setCode(WCHR);
		ssr1.setStatus(CONFIRMED);
		specialServiceRequests.add(ssr1);

		SpecialServiceRequest ssr2 = new SpecialServiceRequest();
		ssr2.setCode(WCMP);
		ssr2.setStatus(CONFIRMED);
		specialServiceRequests.add(ssr2);
		return specialServiceRequests;
	}

	private List<SpecialServiceRequest> getPassenger2Flight3DetailsSSRs() {
		List<SpecialServiceRequest> specialServiceRequests = new ArrayList<>();
		SpecialServiceRequest ssr1 = new SpecialServiceRequest();
		ssr1.setCode(WCHR);
		ssr1.setStatus(CONFIRMED);
		specialServiceRequests.add(ssr1);

		SpecialServiceRequest ssr2 = new SpecialServiceRequest();
		ssr2.setCode(WCMP);
		ssr2.setStatus(CONFIRMED);
		specialServiceRequests.add(ssr2);
		return specialServiceRequests;
	}

	private List<SpecialServiceRequest> getPassenger2Flight4DetailsSSRs() {
		List<SpecialServiceRequest> specialServiceRequests = new ArrayList<>();
		SpecialServiceRequest ssr1 = new SpecialServiceRequest();
		ssr1.setCode(WCHR);
		ssr1.setStatus(CONFIRMED);
		specialServiceRequests.add(ssr1);

		SpecialServiceRequest ssr2 = new SpecialServiceRequest();
		ssr2.setCode(WCMP);
		ssr2.setStatus(CONFIRMED);
		specialServiceRequests.add(ssr2);
		return specialServiceRequests;
	}

}