package dao;

import database.Storage;
import model.AbstractEntity;
import model.Mac;

import java.util.List;

public interface CrudDao<T extends AbstractEntity> {

    Storage storage = new Storage();

    void save(T type);

    List<T> getAll();

    T update(T type);

    void delete(T type);
}
