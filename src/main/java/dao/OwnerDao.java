package dao;


import model.Owner;


import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface OwnerDao {

    String getFirstOwner() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException;
}
