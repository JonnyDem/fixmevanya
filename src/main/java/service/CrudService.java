package service;

import model.AbstractEntity;
import model.PowerBank;

import java.util.List;

public interface CrudService<T extends AbstractEntity> {

    void save(T type);

    List<T> getAll();

    T update(T type);

    void delete(T type);
}
