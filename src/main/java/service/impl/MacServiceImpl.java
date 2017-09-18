package service.impl;

import dao.CrudDao;
import dao.MacDao;
import dao.factory.DaoFactory;
import dao.impl.MacDaoImpl;
import model.Mac;
import service.CrudService;
import service.MacService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * @author Igor Hnes on 9/14/17.
 */
public class MacServiceImpl implements MacService,CrudService<Mac> {

    CrudDao crudDao = DaoFactory.getMacCrudDao();
    MacDao macDao = DaoFactory.getMacDao();

    @Override
    public void save(Mac mac) {
        crudDao.save(mac);
    }

    @Override
    public List<Mac> getAll() {
        return crudDao.getAll();
    }

    @Override
    public Mac update(Mac mac) {
        crudDao.update(mac);
        return mac;
    }

    @Override
    public void delete(Mac mac) {
     crudDao.delete(mac);
    }

    @Override
    public String getFirstMac() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
      return  macDao.getFirstMac();
    }
}
