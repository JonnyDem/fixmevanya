package dao.impl;

import dao.CrudDao;
import dao.IphoneDao;
import database.Storage;
import model.Iphone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class IphoneDaoImpl implements IphoneDao, CrudDao<Iphone> {

    @Override
    public void save(Iphone iphone) {
        storage.addIphone(iphone);
        long count = 1;
        for (int i = 0; i < Storage.iphoneList.size(); i++) {
            if (Storage.iphoneList.get(i).getId() == count) {
                count++;
                i = 0;
            }
        }
        iphone.setId(count);

    }

    @Override
    public List<Iphone> getAll() {
        System.out.println(Storage.getIphoneList());
        return Storage.getIphoneList();
    }

    @Override
    public Iphone update(Iphone iphone) {
        if (iphone.getPrice() == 200) {
            iphone.setPrice(20);
        }
        return iphone;
    }

        @Override
        public void delete (Iphone iphone){
            Storage.macList.remove(iphone);
            iphone.setId(0);
        }

        @Override
        public String getFirstIphone () throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            Class<? extends Storage> storageClass = storage.getClass();
            Method getFirstIphone = storageClass.getDeclaredMethod("getFirstIphone");
            getFirstIphone.setAccessible(true);
            System.out.println("First Iphone: " + getFirstIphone.invoke(storage));
            return getFirstIphone.invoke(storage).toString();
        }
    }

