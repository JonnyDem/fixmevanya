package dao.factory;

import dao.*;
import dao.impl.IphoneDaoImpl;
import dao.impl.MacDaoImpl;
import dao.impl.OwnerDaoImpl;
import dao.impl.PowerBankDaoImpl;
import model.Mac;

public class DaoFactory <T>{

    public static MacDao getMacDao(){
        return new MacDaoImpl();
    }
    public static IphoneDao getIphoneDao(){
        return new IphoneDaoImpl();
    }
    public static OwnerDao getOwnerDao(){
        return new OwnerDaoImpl();
    }
    public static PowerBankDao getPowerBankDao(){
        return new PowerBankDaoImpl();
    }


    public static CrudDao getMacCrudDao(){
        return new MacDaoImpl();
    }
    public static CrudDao getIphoneCrudDao(){
        return new IphoneDaoImpl();
    }
    public static CrudDao getOwnerCrudDao(){
        return new OwnerDaoImpl();
    }
    public static CrudDao getPowerBankCrudDao(){
        return new PowerBankDaoImpl();
    }
}
