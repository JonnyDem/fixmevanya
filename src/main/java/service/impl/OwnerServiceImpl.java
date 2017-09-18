package service.impl;



import dao.CrudDao;
import dao.IphoneDao;
import dao.MacDao;
import dao.OwnerDao;
import dao.factory.DaoFactory;
import model.Mac;
import model.Owner;
import service.CrudService;
import service.OwnerService;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class OwnerServiceImpl implements OwnerService, CrudService<Owner> {

    CrudDao crudDao = DaoFactory.getOwnerCrudDao();
    OwnerDao ownerDao = DaoFactory.getOwnerDao();

    @Override
    public void save(Owner owner) {
    crudDao.save(owner);
    }

    @Override
    public List<Owner> getAll() {
        return crudDao.getAll();
    }

    @Override
    public Owner update(Owner owner) {
        crudDao.update(owner);
        return owner;
    }

    @Override
    public void delete(Owner owner) {
        crudDao.delete(owner);
    }

    @Override
    public String getFirstOwner() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return ownerDao.getFirstOwner();
    }
}
