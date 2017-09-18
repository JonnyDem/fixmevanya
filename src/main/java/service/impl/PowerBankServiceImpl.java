package service.impl;

import dao.CrudDao;
import dao.OwnerDao;
import dao.PowerBankDao;
import dao.factory.DaoFactory;
import model.PowerBank;
import service.CrudService;
import service.PowerBankService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PowerBankServiceImpl implements PowerBankService, CrudService<PowerBank> {

    CrudDao crudDao = DaoFactory.getPowerBankCrudDao();
   PowerBankDao powerBankDao = DaoFactory.getPowerBankDao();

    @Override
    public void save(PowerBank powerBank) {
     crudDao.save(powerBank);
    }

    @Override
    public List<PowerBank> getAll() {
        return crudDao.getAll();
    }

    @Override
    public PowerBank update(PowerBank powerBank) {
        crudDao.update(powerBank);
        return powerBank;
    }

    @Override
    public void delete(PowerBank powerBank) {
        crudDao.delete(powerBank);
    }

    @Override
    public String getFirstPowerBank() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return powerBankDao.getFirstPowerBank();
    }
}
