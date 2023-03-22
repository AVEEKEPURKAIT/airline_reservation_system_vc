package com.ars_vc.service;

import javax.persistence.PersistenceException;


import com.ars_vc.entity.Passenger;
import com.ars_vc.exception.GlobalException;
import com.ars_vc.model.PassengerDto;

public interface PassengerService {
	void savePassenger(Passenger passenger);
	boolean login(String userName,String password);
	PassengerDto getPassengerById(int id)throws GlobalException;
	PassengerDto updatePassenger(int id,Passenger passenger);
	void deletePassenger(int id)throws PersistenceException;
}
