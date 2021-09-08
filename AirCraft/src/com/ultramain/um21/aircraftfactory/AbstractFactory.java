package com.ultramain.um21.aircraftfactory;

import com.ultramain.um21.aircraftDao.IDao;

public abstract class AbstractFactory {
   public abstract IDao getDao();
   public static AbstractFactory getFactory(int choice){
   AbstractFactory factory = null;
   if(choice == 1){
	   factory = new OracleFactory();
   }else if(choice == 2){
	   factory = new FileSystemFactory();
   }
   return factory;
}
}
