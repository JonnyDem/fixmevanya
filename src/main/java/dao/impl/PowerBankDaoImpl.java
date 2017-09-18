package dao.impl;

import dao.CrudDao;
import dao.PowerBankDao;
import database.Storage;
import model.PowerBank;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class PowerBankDaoImpl implements PowerBankDao, CrudDao<PowerBank> {

    @Override
    public void save(PowerBank powerBank) {
     storage.addPowerBank(powerBank);
        long count = 1;
        for (int i = 0; i < Storage.powerBankList.size() ; i++) {
            if (Storage.powerBankList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
        powerBank.setId(count);
    }

    @Override
    public List<PowerBank> getAll() {
        System.out.println(Storage.getPowerBankList());
        return Storage.getPowerBankList();
    }

    @Override
    public PowerBank update(PowerBank powerBank) {
        if(powerBank.getWeight()==500){
            powerBank.setWeight(476.89);
        }
        return powerBank;
    }

    @Override
    public void delete(PowerBank powerBank) {
     Storage.powerBankList.remove(powerBank);
     powerBank.setId(0);
    }

    @Override
    public String getFirstPowerBank() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends Storage> storageClass = storage.getClass();
        Method getFirstPowerBank = storageClass.getDeclaredMethod("getFirstPowerBank");
        getFirstPowerBank.setAccessible(true);
        System.out.println("First power bank: " + getFirstPowerBank.invoke(storage));
        return getFirstPowerBank.invoke(storage).toString();
    }
}
