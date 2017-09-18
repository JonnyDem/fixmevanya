package dao.impl;

import dao.CrudDao;
import dao.MacDao;
import database.Storage;
import model.Mac;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class MacDaoImpl implements MacDao, CrudDao<Mac> {

    @Override
    public void save(Mac mac) {
        storage.addMac(mac);
        long count = 1;
        for (int i = 0; i <Storage.macList.size() ; i++) {
            if (Storage.macList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
       mac.setId(count);
    }

    @Override
    public List<Mac> getAll() {
        System.out.println(Storage.getMacList());
        return Storage.getMacList();
    }

    @Override
    public Mac update(Mac mac) {
        if(mac.getColor().equals("White")){
            mac.setColor("Silver");
        }
        return mac;
    }

    @Override
    public void delete(Mac mac) {
        Storage.macList.remove(mac);
        mac.setId(0);
    }


    @Override
    public String getFirstMac() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends Storage> storageClass = storage.getClass();
        Method getFirstMac = storageClass.getDeclaredMethod("getFirstMac");
        getFirstMac.setAccessible(true);
        System.out.println("First Mac: " + getFirstMac.invoke(storage));
        return getFirstMac.invoke(storage).toString();
    }
}
