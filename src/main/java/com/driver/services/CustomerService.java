package com.driver.services;


import java.util.List;
import java.util.Optional;

import com.driver.model.Customer;
import com.driver.model.Driver;
import com.driver.model.TripBooking;
import com.driver.model.TripStatus;
import com.driver.repository.CustomerRepository;
import com.driver.repository.DriverRepository;
import com.driver.repository.TripBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;


public interface CustomerService {

	public void register(Customer customer);

	public void deleteCustomer(Integer customerId);

	public TripBooking bookTrip(int customerId, String fromLocation, String toLocation, int distanceInKm) throws Exception;

	public void cancelTrip(Integer tripId);

	public void completeTrip(Integer tripId);

}