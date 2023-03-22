package com.ars_vc.serviceImpl;

import javax.persistence.PersistenceException;

import org.modelmapper.ModelMapper;

import com.ars_vc.dao.AirlineDAO;
import com.ars_vc.daoImpl.AirlineDAOImpl;
import com.ars_vc.entity.Airline;
import com.ars_vc.exception.GlobalException;
import com.ars_vc.model.AirlineDTO;
import com.ars_vc.service.AirlineService;

public class AirlineServiceImpl implements AirlineService{
	AirlineDAO airlineDAO=new AirlineDAOImpl();

	public void saveAirline(Airline airline) {
		airlineDAO.saveAirline(airline);

	}

	public void assignAirlineToFlight(int flightId, int airId) {
		airlineDAO.assignAirlineToFlight(flightId, airId);

		
	}

	public AirlineDTO getAirlineByName(String name) {
		Airline airline=airlineDAO.getAirlineByName(name);
		if(airline!=null) {
			return new ModelMapper().map(airline, AirlineDTO.class);
		}
		throw new GlobalException("Airline detalis not exsit!!");

		
	}

	public AirlineDTO updateAirlineById(int id, Airline airline) {
		Airline a= airlineDAO.updateAirlineById(id, airline);
		return new ModelMapper().map(a, AirlineDTO.class);

		
	}

	public void deleteAirline(int id) throws PersistenceException {
		airlineDAO.deleteAirline(id);
		

	}

}
