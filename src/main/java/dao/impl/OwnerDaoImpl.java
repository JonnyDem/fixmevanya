package dao.impl;

import dao.CrudDao;
import dao.OwnerDao;
import database.Storage;
import model.Owner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class OwnerDaoImpl implements OwnerDao, CrudDao<Owner> {

    @Override
    public void save(Owner owner) {
        storage.addOwner(owner);
        long count = 1;
        for (int i = 0; i <Storage.ownerList.size() ; i++) {
            if (Storage.ownerList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
        owner.setId(count);
    }

    @Override
    public List<Owner> getAll() {
        System.out.println(Storage.getOwnerList());
        return Storage.getOwnerList();
    }

    @Override
    public Owner update(Owner owner) {
        if(owner.getJobPosition().equals("Driver")){
            owner.setJobPosition("Programmer");
        }
        return owner;
    }

    @Override
    public void delete(Owner owner) {
        Storage.ownerList.remove(owner);
        owner.setId(0);
    }

    @Override
    public String getFirstOwner() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<? extends Storage> storageClass = storage.getClass();
        Method getFirstOwner = storageClass.getDeclaredMethod("getFirstOwner");
        getFirstOwner.setAccessible(true);
        System.out.println("First owner: " + getFirstOwner.invoke(storage));
        return getFirstOwner.invoke(storage).toString();
    }
}
