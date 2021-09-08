package com.ultramain.um21.aircraftfactory;

import com.ultramain.um21.aircraftDao.IDao;
import com.ultramain.um21.aircraftDao.OracleDao;

public class OracleFactory extends AbstractFactory {

	@Override
	public IDao getDao() {
		return new OracleDao();
	}

}
