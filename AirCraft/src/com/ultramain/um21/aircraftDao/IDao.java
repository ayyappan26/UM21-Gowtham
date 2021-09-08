package com.ultramain.um21.aircraftDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.ultramain.um21.aircraftbo.AircraftDto;

public interface IDao {
	
	public void registerAircraft(AircraftDto dto) throws SQLException;
	public void registerSector(AircraftDto dto) throws SQLException;
	public void viewAircraft() throws SQLException;
	public HashMap<String, ArrayList<AircraftDto>> viewSector() throws SQLException;

}
